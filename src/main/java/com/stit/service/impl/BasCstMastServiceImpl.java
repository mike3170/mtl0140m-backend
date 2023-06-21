package com.stit.service.impl;

import com.stit.common.ResourceNotFoundException;
import com.stit.dto.BasCstMastDto;
import com.stit.entity.BasCstMast;
import com.stit.repositoty.BasCstMastRepo;
import com.stit.service.BasCstMastService;
import com.stit.utils.sql.SqlUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.persistence.EntityManager;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BasCstMastServiceImpl implements BasCstMastService {

    @Autowired
    private BasCstMastRepo basCstMastRepo;

    @Autowired
    private EntityManager em;

    @Autowired
    private SqlUtil sqlUtil;

    @Override
    public BasCstMastDto insert(BasCstMastDto basCstMast) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BasCstMastDto update(BasCstMastDto basCstMast) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteById(String cstNo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BasCstMastDto findById(String cstNo) {
        Optional<BasCstMast> opt = this.basCstMastRepo.findById(cstNo);
        BasCstMastDto dto = new BasCstMastDto();

        if (opt.isPresent()) {
            dto = this.asBasCstMastDto(opt.get());
        } else {
            throw new ResourceNotFoundException("cstNo:" + cstNo);
        }
        return dto;
    }

    @Override
    public Boolean existById(String cstNo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> findAllPk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<BasCstMastDto> findAll() {
        List<BasCstMast> basCstMastList = this.basCstMastRepo.findAll();
        List<BasCstMastDto> resultList = new ArrayList<>();

        for (BasCstMast basCstMast : basCstMastList) {
            resultList.add(this.asBasCstMastDto(basCstMast));
        }
        return resultList;
    }

    @Override
    public List<String> findWindow(String cstNoB, String cstNoE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> query(Map<String, List<String>> params) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private BasCstMastDto asBasCstMastDto(BasCstMast basCstMast) {
        BasCstMastDto basCstMastDto = new BasCstMastDto();
        BeanUtils.copyProperties(basCstMast, basCstMastDto);

        return basCstMastDto;
    }

    private BasCstMast Dto2BasCstMast(BasCstMastDto basCstMastDto) {
        BasCstMast basCstMast = new BasCstMast();
        BeanUtils.copyProperties(basCstMastDto, basCstMast);
        return basCstMast;

    }

}
