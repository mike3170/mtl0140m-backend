package com.stit.service.impl;

import com.stit.common.ResourceExistsException;
import com.stit.common.ResourceNotFoundException;
import com.stit.dto.MtlPurOrdeMDto;
import com.stit.entity.MtlPurOrdeMAng;
import com.stit.repositoty.MtlPurOrdeMRepo;
import com.stit.service.MtlPurOrdeMService;
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
public class MtlPurOrdeMServiceImpl implements MtlPurOrdeMService {

    @Autowired
    private MtlPurOrdeMRepo mtlPurOrdeMRepo;

    @Override
    public MtlPurOrdeMDto insert(MtlPurOrdeMDto mtlPurOrdeMDto) {
        boolean isExist = this.mtlPurOrdeMRepo.existsById(mtlPurOrdeMDto.getPoNo());
        if (isExist) {
            throw new ResourceExistsException();
        }

        MtlPurOrdeMAng mtlPurOrdeMAng = this.mtlPurOrdeMDto2Entity(mtlPurOrdeMDto);
        MtlPurOrdeMAng savemtlPurOrdeMAng = this.mtlPurOrdeMRepo.save(mtlPurOrdeMAng);

        return this.mtlPurOrdeMAng2Dto(savemtlPurOrdeMAng);
    }

    @Override
    public MtlPurOrdeMDto update(MtlPurOrdeMDto mtlPurOrdeMDto) {
        boolean isExist = this.mtlPurOrdeMRepo.existsById(mtlPurOrdeMDto.getPoNo());
        if (!isExist) {
            throw new ResourceNotFoundException();
        }

        MtlPurOrdeMAng mtlPurOrdeMAng = this.mtlPurOrdeMDto2Entity(mtlPurOrdeMDto);
        MtlPurOrdeMAng savemtlPurOrdeMAng = this.mtlPurOrdeMRepo.save(mtlPurOrdeMAng);

        return this.mtlPurOrdeMAng2Dto(savemtlPurOrdeMAng);
    }

    @Override
    public void deleteById(String poNo) {
        boolean isExist = this.mtlPurOrdeMRepo.existsById(poNo);
        if (!isExist) {
            throw new ResourceNotFoundException();
        }        
        this.mtlPurOrdeMRepo.deleteById(poNo);
    }

    @Override
    public MtlPurOrdeMDto findById(String poNo) {
        boolean isExist = this.mtlPurOrdeMRepo.existsById(poNo);
        if (!isExist) {
            throw new ResourceNotFoundException();
        } 
        Optional<MtlPurOrdeMAng> result  = this.mtlPurOrdeMRepo.findById(poNo);
        
        MtlPurOrdeMDto resultDto = this.mtlPurOrdeMAng2Dto(result.get());
        
        return resultDto;
    }

    @Override
    public Boolean existById(String poNo) {
        boolean isExist = this.mtlPurOrdeMRepo.existsById(poNo);
        return isExist;
    }

    @Override
    public List<String> findAllPk() {
        List<MtlPurOrdeMAng> result = this.mtlPurOrdeMRepo.findAll();
        List<String> resultList = new ArrayList();
        for (MtlPurOrdeMAng mtlPurOrdeMAng : result) {
            resultList.add(mtlPurOrdeMAng.getPoNo());
        }
        return resultList;
    }

    @Override
    public List<MtlPurOrdeMDto> findAll() {
        System.out.println("findall");
        List<MtlPurOrdeMAng> mtlPurOrdeMList = this.mtlPurOrdeMRepo.findAll();

        List<MtlPurOrdeMDto> resultList = new ArrayList<>();

        for (MtlPurOrdeMAng mtlPurOrdeMAng : mtlPurOrdeMList) {
            resultList.add(this.mtlPurOrdeMAng2Dto(mtlPurOrdeMAng));
        }
//		List<MtlMastDto> resultList
//			= mtlKnd11List.stream()
//				.map(this::asMtlMastDto)
//				.collect(toList());
        return resultList;
    }

    @Override
    public List<String> findWindow(Map<String, String> params) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> query(Map<String, List<String>> params) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private MtlPurOrdeMAng mtlPurOrdeMDto2Entity(MtlPurOrdeMDto mtlPurOrdeMDto) {
        MtlPurOrdeMAng entity = new MtlPurOrdeMAng();

        BeanUtils.copyProperties(mtlPurOrdeMDto, entity);

        return entity;
    }
    
    private MtlPurOrdeMDto mtlPurOrdeMAng2Dto(MtlPurOrdeMAng mtlPurOrdeMAng) {
        MtlPurOrdeMDto dto = new MtlPurOrdeMDto();

        BeanUtils.copyProperties(mtlPurOrdeMAng, dto);

        return dto;
    }
}
