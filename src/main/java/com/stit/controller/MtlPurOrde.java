/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.dto.MtlPurOrdeDDto;
import com.stit.dto.MtlPurOrdeMDto;
import com.stit.entity.MtlPurOrdeDAngPK;
import com.stit.service.MtlPurOrdeDService;
import com.stit.service.MtlPurOrdeMService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mike
 */
@RestController
@RequestMapping("/api/purorde")
public class MtlPurOrde {

    @Autowired
    private MtlPurOrdeMService masterSvc;
    @Autowired
    private MtlPurOrdeDService detailSvc;

    @PostMapping("/m/insert")
    public ApiResponse insert(@RequestBody MtlPurOrdeMDto mtlPurOrdeMDto) {
        try {
            this.masterSvc.insert(mtlPurOrdeMDto);

            return ApiResponse.ok("ok");
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @PutMapping("/d/update")
    public ApiResponse update(@RequestBody MtlPurOrdeMDto mtlPurOrdeMDto) {
        try {
            MtlPurOrdeMDto dto = this.masterSvc.update(mtlPurOrdeMDto);

            return ApiResponse.ok(dto);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @DeleteMapping("m/{poNo}")
    public ApiResponse delete(@PathVariable String mtlNo) {
        try {
            this.masterSvc.deleteById(mtlNo);
            return ApiResponse.ok();
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("{poNo}")
    public ApiResponse findByMasterPk(@PathVariable("poNo") String xzz) {
        try {
            MtlPurOrdeMDto dto = this.masterSvc.findById(xzz);

            return ApiResponse.ok(dto);

        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }
    
    @GetMapping("{poNo}/detail/{itemNo}")
    public ApiResponse findByDetailPk(@PathVariable("poNo") String poNo, @PathVariable("itemNo") Short itemNo) {
        try {
            MtlPurOrdeDAngPK pk = new MtlPurOrdeDAngPK(poNo, itemNo);
            MtlPurOrdeDDto dto = this.detailSvc.findById(pk);

            return ApiResponse.ok(dto);

        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }    

    @GetMapping("")
    public ApiResponse findAll() {
        try {
            //List<OrdDto> dtoList = this.ordService.findAll();
            //return ApiResponse.ok(dtoList);
            List<String> idList = this.masterSvc.findAllPk();
            return ApiResponse.ok(idList);
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.error(e.getMessage());
        }
    }
    
    @GetMapping("detail/{poNo}")
    public ApiResponse findAllDetail(@PathVariable("poNo") String poNo) {
        try {
            //List<OrdDto> dtoList = this.ordService.findAll();
            //return ApiResponse.ok(dtoList);
            System.out.println("hello");
            List<MtlPurOrdeDAngPK> idList = this.detailSvc.findLinePk(poNo);
            return ApiResponse.ok(idList);
        } catch (Exception e) {
            e.printStackTrace();
            return ApiResponse.error(e.getMessage());
        }
    }    
    
	/**
	 * 查詢 matrix variable
	 */
	@GetMapping("query/{params}")
	public ApiResponse query(
		@MatrixVariable(pathVar = "params") Map<String, List<String>> params) {
		//System.out.println("empController matrix: " + params);

		try {
			List<String> idList = this.masterSvc.query(params);
			return ApiResponse.ok(idList);
		} catch (Exception ex) {
			return ApiResponse.error(ex.getMessage());
		}
	}
        
	/**
	 * Find Window
	 */
	@GetMapping("findwindow/{params}")
	public ApiResponse findWindow(@MatrixVariable(pathVar = "params") Map<String, String> params) {
		try {
                    System.out.println(params);
			List<String> idList = this.masterSvc.findWindow(params);
			return ApiResponse.ok(idList);
		} catch (Exception ex) {
			return ApiResponse.error(ex.getMessage());
		}
	}
}
