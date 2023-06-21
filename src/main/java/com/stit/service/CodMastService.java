package com.stit.service;

import com.stit.dto.CodMastDto;
import com.stit.entity.CodMastPK;
import java.util.List;
import java.util.Map;

public interface CodMastService {

    List<CodMastDto> findAll();
    
    CodMastDto findById(CodMastPK codMastPK);
    
    List<CodMastDto> findByKind(String kind);
    
    boolean existById(CodMastPK codMastPK);
    
    String getCodeName(CodMastPK codMastPK);
}
