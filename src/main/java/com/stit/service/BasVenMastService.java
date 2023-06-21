package com.stit.service;


import com.stit.dto.BasVenMastDto;
import java.util.List;
import java.util.Map;

public interface BasVenMastService {

    BasVenMastDto insert(BasVenMastDto basVenMast);    
    BasVenMastDto update(BasVenMastDto basVenMast);    
    void deleteById(String venNo);
    
    BasVenMastDto findById(String venNo);
    
    Boolean existById(String venNo);
    
    List<String> findAllPk();
    List<BasVenMastDto> findAll();
    
    List<String> findWindow(String venNoB, String venNoE);
    List<String> query(Map<String, List<String>> params);
}
