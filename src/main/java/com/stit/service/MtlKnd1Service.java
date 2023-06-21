package com.stit.service;

import com.stit.dto.MtlKnd1Dto;
import java.util.List;
import java.util.Map;

public interface MtlKnd1Service {

    MtlKnd1Dto insert(MtlKnd1Dto mtlKnd1);
    MtlKnd1Dto update(MtlKnd1Dto mtlKnd1);
    void deleteById(String mtlNo1);
    
    MtlKnd1Dto findById(String mtlNo1);
    
    Boolean existById(String mtlNo1);
    
    List<String> findAllPk();
    List<MtlKnd1Dto> findAll();
    
    List<String> query(Map<String, List<String>> params);
}
