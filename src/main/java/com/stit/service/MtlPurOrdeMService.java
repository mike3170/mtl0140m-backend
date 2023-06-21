/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stit.service;

import com.stit.dto.MtlPurOrdeMDto;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mike
 */
public interface MtlPurOrdeMService {

    MtlPurOrdeMDto insert(MtlPurOrdeMDto mtlPurOrdeM);

    MtlPurOrdeMDto update(MtlPurOrdeMDto mtlPurOrdeM);

    void deleteById(String poNo);

    MtlPurOrdeMDto findById(String poNo);

    Boolean existById(String poNo);

    List<String> findAllPk();

    List<MtlPurOrdeMDto> findAll();

    List<String> findWindow(Map<String, String> params);

    List<String> query(Map<String, List<String>> params);
}
