package com.stit.service.impl;

import com.stit.common.ResourceNotFoundException;
import com.stit.dto.MtlPurOrdeDDto;
import com.stit.entity.MtlPurOrdeDAng;
import com.stit.entity.MtlPurOrdeDAngPK;
import com.stit.repositoty.MtlPurOrdeDRepo;
import com.stit.service.MtlPurOrdeDService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mike
 */
@Service
@Transactional
public class MtlPurOrdeDServiceImpl implements MtlPurOrdeDService {

    @Autowired
    private MtlPurOrdeDRepo mtlPurOrdeDRepo;

    @Override
    public MtlPurOrdeDDto insert(MtlPurOrdeDDto mtlPurOrdeD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MtlPurOrdeDDto update(MtlPurOrdeDDto mtlPurOrdeD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteById(MtlPurOrdeDAngPK pk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MtlPurOrdeDDto findById(MtlPurOrdeDAngPK pk) {
        Optional<MtlPurOrdeDAng> opt = this.mtlPurOrdeDRepo.findById(pk);
        MtlPurOrdeDDto result = new MtlPurOrdeDDto();
        if (opt.isPresent()) {
            result = this.asMtlKnd1Dto(opt.get());
            System.out.println("find id result:" + result.getPoNo());
        } else {
            throw new ResourceNotFoundException();
        }
        return result;
    }

    @Override
    public Boolean existById(MtlPurOrdeDAngPK pk) {
        Boolean result = this.mtlPurOrdeDRepo.existsById(pk);
        return result;
    }

    @Override
    public List<MtlPurOrdeDAngPK> findAllPk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MtlPurOrdeDDto> findAll() {
        List<MtlPurOrdeDAng> list = this.mtlPurOrdeDRepo.findAll();

        List<MtlPurOrdeDDto> resultList = new ArrayList<>();

        for (MtlPurOrdeDAng mtlPurOrdeDAng : list) {
            MtlPurOrdeDDto result = this.asMtlKnd1Dto(mtlPurOrdeDAng);
            resultList.add(result);
        }
        return resultList;
    }
    
    @Override
    public List<MtlPurOrdeDAngPK> findLinePk(String poNo) {

        List<MtlPurOrdeDAngPK> result = this.mtlPurOrdeDRepo.findDetailPk(poNo);
                
        return result;
    }

    @Override
    public List<String> findWindow(Map<String, String> params) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> query(Map<String, List<String>> params) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private MtlPurOrdeDDto asMtlKnd1Dto(MtlPurOrdeDAng mtlPurOrdeDAng) {
        MtlPurOrdeDDto dto = new MtlPurOrdeDDto();        
        BeanUtils.copyProperties(mtlPurOrdeDAng, dto);
        dto.setPoNo(mtlPurOrdeDAng.getMtlPurOrdeDAngPK().getPoNo());
        dto.setItemNo(mtlPurOrdeDAng.getMtlPurOrdeDAngPK().getItemNo());

        return dto;
    }

    private MtlPurOrdeDAng Dto2mtlKnd1Ang(MtlPurOrdeDDto dto) {
        MtlPurOrdeDAng mtlPurOrdeDAng = new MtlPurOrdeDAng();
        BeanUtils.copyProperties(dto, mtlPurOrdeDAng);

        return mtlPurOrdeDAng;

    }
}
