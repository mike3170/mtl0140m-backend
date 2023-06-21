package com.stit.service;

import com.stit.dto.MtlMastDto;
import java.util.List;
import java.util.Map;

public interface MtlMastService {

    MtlMastDto insert(MtlMastDto mtlMast);    
    MtlMastDto update(MtlMastDto mtlMast);    
    void deleteById(String mtlNo);
    
    MtlMastDto findById(String mtlNo);
    
    Boolean existById(String mtlNo);
    
    List<String> findAllPk();
    List<MtlMastDto> findAll();
    List<String> findWindow(Map<String, String> params);
    
    List<String> query(Map<String, List<String>> params);
}
