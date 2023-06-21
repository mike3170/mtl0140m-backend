package com.stit.service;

import com.stit.domain.Emp;
import com.stit.dto.EmpDto;
import java.util.List;
import java.util.Map;

public interface EmpService {

    EmpDto insert(Emp emp);    
    EmpDto update(Emp emp);    
    void deleteById(String empId);
    
    EmpDto findById(String empId);
    
    Boolean existById(String empId);
    
    List<EmpDto> findAll();
    
    List<EmpDto> Query(Map<String, List<String>> params);
}
