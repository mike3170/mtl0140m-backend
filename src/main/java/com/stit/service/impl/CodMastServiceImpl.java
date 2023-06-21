package com.stit.service.impl;

import com.stit.common.ResourceExistsException;
import com.stit.common.ResourceNotFoundException;
import com.stit.dto.CodMastDto;
import com.stit.dto.MtlKnd1Dto;
import com.stit.entity.CodMast;
import com.stit.entity.CodMastPK;
import com.stit.entity.MtlKnd1Ang;
import com.stit.repositoty.CodMastRepo;
import com.stit.repositoty.MtlKnd1Repo;
import com.stit.service.CodMastService;
import com.stit.service.MtlKnd1Service;
import com.stit.utils.sql.SqlUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static java.util.stream.Collectors.toList;
import javax.persistence.EntityManager;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CodMastServiceImpl implements CodMastService {
    
    @Autowired
    private CodMastRepo codMastRepo;
    
    @Autowired
    private EntityManager em;
    
    @Autowired
    private SqlUtil sqlUtil;
    
  

    
    @Override
    public CodMastDto findById(CodMastPK pk) {
        Optional<CodMast> opt = this.codMastRepo.findById(pk);
        CodMastDto codMastDto
                = opt.map(this::asCodMastDto)
                        .orElseThrow(() -> new ResourceNotFoundException("Kind:" + pk.getKind()+'\n'+
                                                                         "Parameter:" + pk.getCodeNo()));        
        return codMastDto;
    }
    
    @Override
    public boolean existById(CodMastPK pk) {
        boolean isExist = this.codMastRepo.existsById(pk);
        return isExist;
    }
    
    @Override
    public String getCodeName(CodMastPK pk) {
        String codeName = this.codMastRepo.getCodeName(pk);
        return codeName;
    }
    
    @Override
    public List<CodMastDto> findByKind(String kind) {
        List<CodMast> codMastList = this.codMastRepo.findByKind(kind);
        
        List<CodMastDto> resultList = new ArrayList<>();

        for (CodMast codMast : codMastList) {
            resultList.add(this.asCodMastDto(codMast));
        }
//		List<MtlMastDto> resultList
//			= mtlKnd11List.stream()
//				.map(this::asMtlMastDto)
//				.collect(toList());
        return resultList;
    }
    

    
    private CodMastDto asCodMastDto(CodMast codMast) {
        CodMastDto codMastDto = new CodMastDto();
        BeanUtils.copyProperties(codMast, codMastDto);
        codMastDto.setKind(codMast.getCodMastPK().getKind());
        codMastDto.setCodeNo(codMast.getCodMastPK().getCodeNo());
        
        return codMastDto;
    }
    
    private CodMast Dto2CodMast(CodMastDto codMastDto) {
        CodMast codMast = new CodMast();
        BeanUtils.copyProperties(codMastDto, codMast);
        
        return codMast;
        
    }

    @Override
    public List<CodMastDto> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
