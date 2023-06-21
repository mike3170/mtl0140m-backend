package com.stit.service.impl;

import com.stit.common.ResourceExistsException;
import com.stit.common.ResourceNotFoundException;
import com.stit.dto.MtlMastDto;
import com.stit.entity.MtlKnd1Ang;
import com.stit.entity.MtlKnd2Ang;
import com.stit.entity.MtlKnd2AngPK;
import com.stit.entity.MtlMastAng;
import com.stit.repositoty.MtlKnd1Repo;
import com.stit.repositoty.MtlKnd2Repo;
import com.stit.repositoty.MtlMastRepo;
import com.stit.service.MtlMastService;
import com.stit.utils.sql.SqlUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static java.util.stream.Collectors.toList;
import javax.persistence.EntityManager;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MtlMastServiceImpl implements MtlMastService {

    @Autowired
    private MtlKnd1Repo mtlKnd1Repo;

    @Autowired
    private MtlKnd2Repo mtlKnd2Repo;

    @Autowired
    private MtlMastRepo mtlMastRepo;

    @Autowired
    private EntityManager em;

    @Autowired
    private SqlUtil sqlUtil;

    @Override
    public MtlMastDto insert(MtlMastDto mtlMastDto) {
        
        boolean isExist = this.mtlMastRepo.existsById(mtlMastDto.getMtlNo());

        if (isExist) {
            throw new ResourceExistsException();
        }

        MtlMastAng mtlMastAng = this.Dto2mtlKnd2Ang(mtlMastDto);
        MtlMastAng saveMtlMastAng = this.mtlMastRepo.save(mtlMastAng);

        return asMtlMastDto(saveMtlMastAng);
    }

    @Override
    public MtlMastDto update(MtlMastDto mtlMastDto) {
        boolean isExist = mtlMastRepo.existsById(mtlMastDto.getMtlNo());
        if (!isExist) {
            throw new ResourceNotFoundException();
        }

        MtlMastAng mtlMastAng = this.Dto2mtlKnd2Ang(mtlMastDto);

        MtlMastAng saveMtlAng = mtlMastRepo.save(mtlMastAng);
        return asMtlMastDto(saveMtlAng);
    }

    @Override
    public void deleteById(String mtlNo) {
        boolean isExist = mtlMastRepo.existsById(mtlNo);
        if (!isExist) {
            throw new ResourceNotFoundException();
        }

        mtlMastRepo.deleteById(mtlNo);
    }

    @Override
    public MtlMastDto findById(String mtlNo) {
        Optional<MtlMastAng> opt = mtlMastRepo.findById(mtlNo);

        MtlMastDto mtlMastDto
                = opt.map(this::asMtlMastDto)
                        .orElseThrow(() -> new ResourceNotFoundException("mtlNo:" + mtlNo));

        return mtlMastDto;
    }

    @Override
    public Boolean existById(String mtlNo) {
        boolean isExist = mtlMastRepo.existsById(mtlNo);
        return isExist;
    }

    @Override
    public List<String> findAllPk() {
        List<MtlMastAng> list = this.mtlMastRepo.findAll(Sort.by(Sort.Direction.ASC, "mtlNo"));

        List<String> resultList = new ArrayList<>();

        for (MtlMastAng mike : list) {
            resultList.add(mike.getMtlNo());
        }
//		List<MtlMastDto> resultList
//			= mtlKnd11List.stream()
//				.map(this::asMtlMastDto)
//				.collect(toList());
        return resultList;
    }

    @Override
    public List<MtlMastDto> findAll() {
        List<MtlMastAng> mtlMastList = this.mtlMastRepo.findAll();

        List<MtlMastDto> resultList = new ArrayList<>();

        for (MtlMastAng mtlMastAng : mtlMastList) {
            resultList.add(this.asMtlMastDto(mtlMastAng));
        }
//		List<MtlMastDto> resultList
//			= mtlKnd11List.stream()
//				.map(this::asMtlMastDto)
//				.collect(toList());
        return resultList;
    }

    @Override
    public List<String> findWindow(Map<String, String> params) {
        try {
            List<String> resultList = this.mtlMastRepo.findWindow(params.get("mtlNoB"), params.get("mtlNoE"), params.get("mtlGrade"));
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

    private MtlMastDto asMtlMastDto(MtlMastAng mtlMastAng) {
        MtlMastDto mtlMastDto = new MtlMastDto();

        Optional<MtlKnd1Ang> opt = this.mtlKnd1Repo.findById(mtlMastAng.getMtlNo1());
        MtlKnd1Ang mtlKnd1Ang = opt.get();
        
        MtlKnd2AngPK knd2PK = new MtlKnd2AngPK(mtlMastAng.getMtlNo1(), mtlMastAng.getMtlNo2());
        Optional<MtlKnd2Ang> optKnd2 = this.mtlKnd2Repo.findById(knd2PK);
        MtlKnd2Ang mtlKnd2Ang = optKnd2.get();

//        Optional<MtlKnd2Ang> opt = this.mtlKnd2Repo.findById(id);
//        MtlKnd2Ang mtlKnd2Ang = opt.get();
        BeanUtils.copyProperties(mtlMastAng, mtlMastDto);
        mtlMastDto.setMtlKnd1Name(mtlKnd1Ang.getKnd1Name());
        mtlMastDto.setMtlKnd2Name(mtlKnd2Ang.getKnd2Name());

        return mtlMastDto;
    }

    private MtlMastAng Dto2mtlKnd2Ang(MtlMastDto mtlMastDto) {
        MtlMastAng mtlMastAng = new MtlMastAng();
        BeanUtils.copyProperties(mtlMastDto, mtlMastAng);
        return mtlMastAng;

    }

}
