package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.dto.MtlMastDto;
import com.stit.dto.MtlPurOrdeDDto;
import com.stit.entity.MtlPurOrdeDAngPK;
import com.stit.service.MtlMastService;
import com.stit.service.MtlPurOrdeDService;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

@RestController
@RequestMapping("/api/mtlpurorded")
public class MtlPurOrdeDController {

    @Autowired
    private MtlPurOrdeDService mtlPurOrdeDService;

    @PostMapping("/insert")
    public ApiResponse insert(@RequestBody MtlPurOrdeDDto ordeDDto) {
        try {
            this.mtlPurOrdeDService.insert(ordeDDto);

            return ApiResponse.ok("ok");
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @PutMapping("/update")
    public ApiResponse update(@RequestBody MtlPurOrdeDDto ordeDDto) {
        try {
            MtlPurOrdeDDto dto = this.mtlPurOrdeDService.update(ordeDDto);

            return ApiResponse.ok(dto);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @DeleteMapping("{poNo}/{itemNo}")
    public ApiResponse delete(@PathVariable String poNo, @PathVariable Short itemNo) {
        try {
            MtlPurOrdeDAngPK pk = new MtlPurOrdeDAngPK(poNo, itemNo);
            
            this.mtlPurOrdeDService.deleteById(pk);
            return ApiResponse.ok();
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }
    @GetMapping("{poNo}")
    public ApiResponse listDetail(@PathVariable String poNo, @PathVariable Short itemNo) {
        try {
            MtlPurOrdeDAngPK pk = new MtlPurOrdeDAngPK(poNo, itemNo);
            MtlPurOrdeDDto dto = this.mtlPurOrdeDService.findById(pk);

            return ApiResponse.ok(dto);

        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }
    
    @GetMapping("{poNo}/{itemNo}")
    public ApiResponse findById(@PathVariable String poNo, @PathVariable Short itemNo) {
        try {
            MtlPurOrdeDAngPK pk = new MtlPurOrdeDAngPK(poNo, itemNo);
            MtlPurOrdeDDto dto = this.mtlPurOrdeDService.findById(pk);
            System.out.println("heelo kkk po:" + dto.getPoNo());
            return ApiResponse.ok(dto);

        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("all")
    public ApiResponse findAll() {
        try {

            List<MtlPurOrdeDDto> resultList = this.mtlPurOrdeDService.findAll();
            return ApiResponse.ok(resultList);
        } catch (Exception e) {
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
			List<String> idList = this.mtlPurOrdeDService.query(params);
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
			List<String> idList = this.mtlPurOrdeDService.findWindow(params);
			return ApiResponse.ok(idList);
		} catch (Exception ex) {
			return ApiResponse.error(ex.getMessage());
		}
	}
}
