package com.stit.service;

import com.stit.dto.MtlKnd2Dto;
import com.stit.entity.MtlKnd2AngPK;
import java.util.List;
import java.util.Map;

public interface MtlKnd2Service {

    MtlKnd2Dto insert(MtlKnd2Dto mtlKnd);
    MtlKnd2Dto update(MtlKnd2Dto mtlKnd);
    void deleteById(MtlKnd2AngPK mtlKnd2AngPK);
    
    MtlKnd2Dto findById(MtlKnd2AngPK mtlKnd2AngPK);
    
    Boolean existById(MtlKnd2AngPK mtlKnd2AngPK);
    
    List<String> findAllPk();
    
    List<MtlKnd2Dto> findByMtlNo1(String mtlNo1);
    
    List<MtlKnd2Dto> findAll();
    
    List<String> query(Map<String, List<String>> params);
}
