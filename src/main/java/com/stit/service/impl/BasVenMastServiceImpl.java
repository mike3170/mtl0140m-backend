package com.stit.service.impl;

import com.stit.common.ResourceExistsException;
import com.stit.common.ResourceNotFoundException;
import com.stit.dto.BasVenMastDto;
import com.stit.entity.BasVenMastAng;
import com.stit.entity.CodMast;
import com.stit.entity.CodMastPK;
import com.stit.entity.MtlMastAng;
import com.stit.repositoty.BasVenMastRepo;
import com.stit.repositoty.CodMastRepo;
import com.stit.service.BasVenMastService;
import com.stit.service.MtlMastService;
import com.stit.utils.sql.SqlUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static java.util.stream.Collectors.toList;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BasVenMastServiceImpl implements BasVenMastService {

    @Autowired
    private BasVenMastRepo basVenMastRepo;

    @Autowired
    private CodMastRepo codMastRepo;

    @Autowired
    private EntityManager em;

    @Autowired
    private SqlUtil sqlUtil;

    @Override
    public BasVenMastDto insert(BasVenMastDto basVenMastDto) {

        boolean isExist = this.basVenMastRepo.existsById(basVenMastDto.getVenNo());

        if (isExist) {
            throw new ResourceExistsException();
        }

        BasVenMastAng basVenMastAng = this.Dto2BasVenMastAng(basVenMastDto);
        BasVenMastAng saveBasVenMast = this.basVenMastRepo.save(basVenMastAng);

        return this.asBasVenMastDto(saveBasVenMast);
    }

    @Override
    public BasVenMastDto update(BasVenMastDto basVenMastDto) {
        boolean isExist = basVenMastRepo.existsById(basVenMastDto.getVenNo());
        if (!isExist) {
            throw new ResourceNotFoundException();
        }

        BasVenMastAng basVenMastAng = this.Dto2BasVenMastAng(basVenMastDto);

        BasVenMastAng saveMtlAng = basVenMastRepo.save(basVenMastAng);
        return this.asBasVenMastDto(saveMtlAng);
    }

    @Override
    public void deleteById(String mtlNo) {
        boolean isExist = basVenMastRepo.existsById(mtlNo);
        if (!isExist) {
            throw new ResourceNotFoundException();
        }

        basVenMastRepo.deleteById(mtlNo);
    }

    @Override
    public BasVenMastDto findById(String venNo) {
        Optional<BasVenMastAng> opt = basVenMastRepo.findById(venNo);

        BasVenMastDto basVenMastDto
                = opt.map(this::asBasVenMastDto)
                        .orElseThrow(() -> new ResourceNotFoundException("venNo:" + venNo));

        return basVenMastDto;
    }

    @Override
    public Boolean existById(String mtlNo) {
        boolean isExist = basVenMastRepo.existsById(mtlNo);
        return isExist;
    }

    @Override
    public List<String> findAllPk() {
        List<BasVenMastAng> list = this.basVenMastRepo.findAll(Sort.by(Sort.Direction.ASC, "venNo"));

        List<String> resultList = new ArrayList<>();

        for (BasVenMastAng mike : list) {
            resultList.add(mike.getVenNo());
        }
//		List<MtlMastDto> resultList
//			= mtlKnd11List.stream()
//				.map(this::asMtlMastDto)
//				.collect(toList());
        return resultList;
    }

    @Override
    public List<BasVenMastDto> findAll() {
        List<BasVenMastAng> basVenMastList = this.basVenMastRepo.findAll();

        List<BasVenMastDto> resultList = new ArrayList<>();

        for (BasVenMastAng basVenMastAng : basVenMastList) {
            resultList.add(this.asBasVenMastDto(basVenMastAng));
        }
//		List<MtlMastDto> resultList
//			= mtlKnd11List.stream()
//				.map(this::asMtlMastDto)
//				.collect(toList());
        return resultList;
    }

    @Override
    public List<String> findWindow(String venNoB, String venNoE) {
        try {

            List<String> resultList
                    = this.em.createQuery("select a.venNo from BasVenMastAng a where a.venNo between COALESCE(:venNoB, ven_no) AND COALESCE(:venNoE, ven_no)", String.class)
                            .setParameter("venNoB", venNoB)
                            .setParameter("venNoE", venNoE)
                            .getResultList();

            return resultList;
        } catch (Exception ex) {
            return new ArrayList();
        }

    }

    @Override
    public List<String> query(Map<String, List<String>> params) {
        String sql = sqlUtil.toSql(MtlMastAng.class, params, "mtl_no");

        List<MtlMastAng> mtlMastList = em.createNativeQuery(sql, MtlMastAng.class)
                .getResultList();

        List<String> idList = mtlMastList.stream()
                .map(mtlMast -> mtlMast.getMtlNo())
                .collect(toList());

        return idList;
    }

    private BasVenMastDto asBasVenMastDto(BasVenMastAng basVenMastAng) {
        BasVenMastDto basVenMastDto = new BasVenMastDto();
        BeanUtils.copyProperties(basVenMastAng, basVenMastDto);

        CodMastPK payTermId = new CodMastPK("APTM", basVenMastAng.getPaymentTerm());
        basVenMastDto.setPayTermName(this.codMastRepo.getCodeName(payTermId));
        
        CodMastPK payKindId = new CodMastPK("ACPK", basVenMastAng.getPayKind());
        basVenMastDto.setPayKindName(this.codMastRepo.getCodeName(payKindId));
        
        CodMastPK invKindId = new CodMastPK("AINV", basVenMastAng.getInvKind());
        basVenMastDto.setInvKindName(this.codMastRepo.getCodeName(invKindId));
        
        CodMastPK texKindId = new CodMastPK("ATAX", basVenMastAng.getTaxId());
        basVenMastDto.setTexKindName(this.codMastRepo.getCodeName(texKindId));        
        
        if (basVenMastAng.getMakeAbility() == "1") {
            basVenMastDto.setMakeAbilityName("優");
        } else if (basVenMastAng.getMakeAbility() == "2"){
            basVenMastDto.setMakeAbilityName("良");
        } else if (basVenMastAng.getMakeAbility() == "3"){
            basVenMastDto.setMakeAbilityName("普");
        }
        
        if (basVenMastAng.getQuality() == "1") {
            basVenMastDto.setQualityName("優");
        } else if (basVenMastAng.getQuality() == "2"){
            basVenMastDto.setQualityName("良");
        } else if (basVenMastAng.getQuality() == "3"){
            basVenMastDto.setQualityName("普");
        };
//        Optional<CodMast> opt = this.codMastRepo.findById(codId);
//        if (opt.isPresent()) {
//            basVenMastDto.setPayTermName(opt.get().getCodeName());
//        }
        
        return basVenMastDto;
    }

    private BasVenMastAng Dto2BasVenMastAng(BasVenMastDto basVenMastDto) {
        BasVenMastAng basVenMastAng = new BasVenMastAng();
        BeanUtils.copyProperties(basVenMastDto, basVenMastAng);
        return basVenMastAng;

    }

}
