package com.stit.service.impl;

import com.stit.common.ResourceExistsException;
import com.stit.common.ResourceNotFoundException;
import com.stit.dto.MtlKnd2Dto;
import com.stit.entity.MtlKnd2Ang;
import com.stit.entity.MtlKnd2AngPK;
import com.stit.repositoty.MtlKnd2Repo;
import com.stit.service.MtlKnd2Service;
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

@Service
public class MtlKnd2ServiceImpl implements MtlKnd2Service {

    @Autowired
    private MtlKnd2Repo mtlKnd2Repo;

    @Autowired
    private EntityManager em;

    @Autowired
    private SqlUtil sqlUtil;

    @Override
    public MtlKnd2Dto insert(MtlKnd2Dto mtlKnd2Dto) {
        MtlKnd2AngPK mtlKnd2AngPK = new MtlKnd2AngPK(mtlKnd2Dto.getMtlNo1(), mtlKnd2Dto.getMtlNo2());
        boolean isExist = this.mtlKnd2Repo.existsById(mtlKnd2AngPK);
        if (isExist) {
            throw new ResourceExistsException();
        }

        MtlKnd2Ang mtlKnd2Ang = this.Dto2mtlKnd2Ang(mtlKnd2Dto);

        MtlKnd2Ang saveMtlKnd2Ang = this.mtlKnd2Repo.save(mtlKnd2Ang);
        return asMtlKnd2Dto(saveMtlKnd2Ang);
    }

    @Override
    public MtlKnd2Dto update(MtlKnd2Dto mtlKnd2Dto) {
        MtlKnd2AngPK mtlKnd2AngPK = new MtlKnd2AngPK(mtlKnd2Dto.getMtlNo1(), mtlKnd2Dto.getMtlNo2());
        boolean isExist = this.mtlKnd2Repo.existsById(mtlKnd2AngPK);

        if (!isExist) {
            throw new ResourceNotFoundException();
        }

        MtlKnd2Ang mtlKnd2Ang = this.Dto2mtlKnd2Ang(mtlKnd2Dto);

        MtlKnd2Ang saveMtlKnd2Ang = this.mtlKnd2Repo.save(mtlKnd2Ang);
        return asMtlKnd2Dto(saveMtlKnd2Ang);
    }

    @Override
    public void deleteById(MtlKnd2AngPK mtlKnd2AngPK) {
        boolean isExist = this.mtlKnd2Repo.existsById(mtlKnd2AngPK);
        if (!isExist) {
            throw new ResourceNotFoundException();
        }

        this.mtlKnd2Repo.deleteById(mtlKnd2AngPK);
    }

    @Override
    public MtlKnd2Dto findById(MtlKnd2AngPK mtlKnd2AngPK) {
        Optional<MtlKnd2Ang> opt = this.mtlKnd2Repo.findById(mtlKnd2AngPK);

        MtlKnd2Dto mtlKnd2Dto
                = opt.map(this::asMtlKnd2Dto)
                        .orElseThrow(() -> new ResourceNotFoundException());

        return mtlKnd2Dto;
    }

    @Override
    public Boolean existById(MtlKnd2AngPK mtlKnd2AngPK) {
        boolean isExist = this.mtlKnd2Repo.existsById(mtlKnd2AngPK);
        return isExist;
    }

    @Override
    public List<String> findAllPk() {
        List<MtlKnd2Ang> mtlKnd21List = this.mtlKnd2Repo.findAll();

        List<String> resultList = new ArrayList<>();

        for (MtlKnd2Ang mtlKnd2Ang : mtlKnd21List) {
            resultList.add(mtlKnd2Ang.getMtlKnd2AngPK().toString());
        }
//		List<MtlKnd2Dto> resultList
//			= mtlKnd11List.stream()
//				.map(this::asMtlKnd2Dto)
//				.collect(toList());
        return resultList;
    }

    @Override
    public List<MtlKnd2Dto> findAll() {
        List<MtlKnd2Ang> mtlKnd11List = this.mtlKnd2Repo.findAll();

//        List<MtlKnd1Dto> resultList = new ArrayList<>();
//        for (MtlKnd1Ang mtlKnd1Ang : mtlKnd11List) {
//            resultList[i] = this.asMtlKnd1Dto(mtlKnd1Ang);
//        }
        List<MtlKnd2Dto> resultList
                = mtlKnd11List.stream()
                        .map(this::asMtlKnd2Dto)
                        .collect(toList());
        return resultList;
    }

    @Override
    public List<MtlKnd2Dto> findByMtlNo1(String mtlNo1) {
        Optional<List<MtlKnd2Ang>> opt = this.mtlKnd2Repo.findMtlNo2ByMtlNo1(mtlNo1);

//        List<MtlKnd2Ang> resultList = new ArrayList();
        if (opt.isPresent()) {
            List<MtlKnd2Ang> resultList = opt.get();
            List<MtlKnd2Dto> dtoList = new ArrayList();
            for (MtlKnd2Ang e : resultList) {                
                dtoList.add(this.asMtlKnd2Dto(e));
            }
            return dtoList;
        } else {
            return List.of();
        }

//		List<MtlKnd2Dto> resultList
//			= mtlKnd2List.stream()
//				.map(this::asMtlKnd2Dto)
//				.collect(toList());        
//        return resultList;
    }

    @Override
    public List<String> query(Map<String, List<String>> params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.        
//        String sql = sqlUtil.toSql(MtlKnd2Ang.class, params, "mtl_no2");
//
//        System.out.println(sql);
//
//        List<MtlKnd2Ang> mtlKnd2List = em.createNativeQuery(sql, MtlKnd2Ang.class)
//                .getResultList();
//
//        List<String> idList = mtlKnd2List.stream()
//                .map(mtlKnd2 -> mtlKnd2.getMtlKnd2AngPK())
//                .collect(toList());
//
//        return idList;
    }

    private MtlKnd2Dto asMtlKnd2Dto(MtlKnd2Ang mtlKnd2Ang) {
        MtlKnd2Dto mtlKnd2Dto = new MtlKnd2Dto();
        BeanUtils.copyProperties(mtlKnd2Ang, mtlKnd2Dto);
        mtlKnd2Dto.setMtlNo1(mtlKnd2Ang.getMtlKnd2AngPK().getMtlNo1());
        mtlKnd2Dto.setMtlNo2(mtlKnd2Ang.getMtlKnd2AngPK().getMtlNo2());
        return mtlKnd2Dto;
    }

    private MtlKnd2Ang Dto2mtlKnd2Ang(MtlKnd2Dto mtlKnd2Dto) {
        MtlKnd2Ang mtlKnd2Ang = new MtlKnd2Ang();
        BeanUtils.copyProperties(mtlKnd2Dto, mtlKnd2Ang);

        return mtlKnd2Ang;

    }

}
