package com.stit.service;

import com.stit.dto.MtlPurOrdeDDto;
import com.stit.entity.MtlPurOrdeDAngPK;
import java.util.List;
import java.util.Map;

public interface MtlPurOrdeDService {
    MtlPurOrdeDDto insert(MtlPurOrdeDDto mtlPurOrdeD);

    MtlPurOrdeDDto update(MtlPurOrdeDDto mtlPurOrdeD);

    void deleteById(MtlPurOrdeDAngPK pk);

    MtlPurOrdeDDto findById(MtlPurOrdeDAngPK pk);
    
    List<MtlPurOrdeDAngPK> findLinePk(String poNo);

    Boolean existById(MtlPurOrdeDAngPK pk);

    List<MtlPurOrdeDAngPK> findAllPk();

    List<MtlPurOrdeDDto> findAll();

    List<String> findWindow(Map<String, String> params);

    List<String> query(Map<String, List<String>> params);
}
