package com.stit.service;


import com.stit.dto.BasCstMastDto;
import java.util.List;
import java.util.Map;

public interface BasCstMastService {

    BasCstMastDto insert(BasCstMastDto basCstMast);    
    BasCstMastDto update(BasCstMastDto basCstMast);    
    void deleteById(String cstNo);
    
    BasCstMastDto findById(String cstNo);
    
    Boolean existById(String cstNo);
    
    List<String> findAllPk();
    List<BasCstMastDto> findAll();
    
    List<String> findWindow(String cstNoB, String cstNoE);
    List<String> query(Map<String, List<String>> params);
}
