package com.stit.service.impl;

import com.stit.common.ResourceExistsException;
import com.stit.common.ResourceNotFoundException;
import com.stit.dto.MtlKnd1Dto;
import com.stit.entity.MtlKnd1Ang;
import com.stit.repositoty.MtlKnd1Repo;
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
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MtlKnd1ServiceImpl implements MtlKnd1Service {
    
    @Autowired
    private MtlKnd1Repo mtlKnd1Repo;
    
    @Autowired
    private EntityManager em;
    
    @Autowired
    private SqlUtil sqlUtil;
    
    @Override
    public MtlKnd1Dto insert(MtlKnd1Dto mtlKnd1Dto) {
        boolean isExist = this.mtlKnd1Repo.existsById(mtlKnd1Dto.getMtlNo1());
        if (isExist) {
            throw new ResourceExistsException();
        }
        
        MtlKnd1Ang mtlKnd1Ang = this.Dto2mtlKnd1Ang(mtlKnd1Dto);
        
        MtlKnd1Ang saveMtlKnd1Ang = this.mtlKnd1Repo.save(mtlKnd1Ang);
        return asMtlKnd1Dto(saveMtlKnd1Ang);
    }
    
    @Override
    public MtlKnd1Dto update(MtlKnd1Dto mtlKnd1Dto) {
        boolean isExist = this.mtlKnd1Repo.existsById(mtlKnd1Dto.getMtlNo1());
        if (!isExist) {
            throw new ResourceNotFoundException();
        }
        
        MtlKnd1Ang mtlKnd1Ang = this.Dto2mtlKnd1Ang(mtlKnd1Dto);
        
        MtlKnd1Ang saveMtlKnd1Ang = this.mtlKnd1Repo.save(mtlKnd1Ang);
        return asMtlKnd1Dto(saveMtlKnd1Ang);
    }
    
    @Override
    public void deleteById(String mtlNo1) {
        boolean isExist = this.mtlKnd1Repo.existsById(mtlNo1);
        if (!isExist) {
            throw new ResourceNotFoundException();
        }
        
        this.mtlKnd1Repo.deleteById(mtlNo1);
    }
    
    @Override
    public MtlKnd1Dto findById(String mtlNo1) {

        Optional<MtlKnd1Ang> opt = this.mtlKnd1Repo.findById(mtlNo1);

        MtlKnd1Ang mtlKnd1 = opt.orElseThrow(() -> new ResourceNotFoundException("mtlNo:" + mtlNo1));
        MtlKnd1Dto mtlKnd1Dto = this.asMtlKnd1Dto(mtlKnd1);
        return mtlKnd1Dto;
//        if (opt.isPresent()) {
//            MtlKnd1Dto mtlKnd1Dto = this.asMtlKnd1Dto(opt.get());
//            return mtlKnd1Dto;
//        } else {
//            System.out.println("exception");
//            throw new ResourceNotFoundException("mtlNo:" + mtlNo1);
//        }

    }
    
    @Override
    public Boolean existById(String mtlNo1) {
        boolean isExist = this.mtlKnd1Repo.existsById(mtlNo1);
        return isExist;
    }
    
    @Override
    public List<String> findAllPk() {
        List<MtlKnd1Ang> mtlKnd11List = this.mtlKnd1Repo.findAll();
        
        List<String> resultList = new ArrayList<>();
        
        
        for (MtlKnd1Ang mtlKnd1Ang : mtlKnd11List) {
            resultList.add(mtlKnd1Ang.getMtlNo1());
        }
//		List<MtlKnd1Dto> resultList
//			= mtlKnd11List.stream()
//				.map(this::asMtlKnd1Dto)
//				.collect(toList());
    return resultList;
    }
    
    @Override
    public List<MtlKnd1Dto> findAll() {
        List<MtlKnd1Ang> mtlKnd11List = this.mtlKnd1Repo.findAll((Sort.by(Sort.Direction.ASC, "mtlNo1")));
        
        List<MtlKnd1Dto> resultList = new ArrayList<>();
        
        
        for (MtlKnd1Ang mtlKnd1Ang : mtlKnd11List) {
            resultList.add(this.asMtlKnd1Dto(mtlKnd1Ang));
        }
//		List<MtlKnd1Dto> resultList
//			= mtlKnd11List.stream()
//				.map(this::asMtlKnd1Dto)
//				.collect(toList());
    return resultList;
    }
    
    @Override
    public List<String> query(Map<String, List<String>> params) {
        String sql = sqlUtil.toSql(MtlKnd1Ang.class, params, "mtl_no1");
        
        List<MtlKnd1Ang> mtlKnd1List = em.createNativeQuery(sql, MtlKnd1Ang.class)
                .getResultList();
        
        List<String> idList = mtlKnd1List.stream()
                .map(mtlMast -> mtlMast.getMtlNo1())
                .collect(toList());
        
        return idList;
    }
    
    private MtlKnd1Dto asMtlKnd1Dto(MtlKnd1Ang mtlKnd1Ang) {

        MtlKnd1Dto mtlKnd1Dto = new MtlKnd1Dto();
        BeanUtils.copyProperties(mtlKnd1Ang, mtlKnd1Dto);

        return mtlKnd1Dto;
    }
    
    private MtlKnd1Ang Dto2mtlKnd1Ang(MtlKnd1Dto mtlKnd1Dto) {
        MtlKnd1Ang mtlKnd1Ang = new MtlKnd1Ang();
        BeanUtils.copyProperties(mtlKnd1Dto, mtlKnd1Ang);
        
        return mtlKnd1Ang;
        
    }
    
}
