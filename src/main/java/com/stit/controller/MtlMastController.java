package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.dto.MtlMastDto;
import com.stit.dto.MtlMastFindWindowDto;
import com.stit.service.MtlMastService;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mtlmast")
public class MtlMastController {

    @Autowired
    private MtlMastService mtlMastService;

    @PersistenceContext
    private EntityManager em;

    @PostMapping("/insert")
    public ApiResponse insert(@RequestBody MtlMastDto mtlMast) {
        try {
            this.mtlMastService.insert(mtlMast);

            return ApiResponse.ok("ok");
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    /**
     * 修改
     *
     * @param mtlMast
     * @return
     */
    @PutMapping("/update")
    public ApiResponse update(@RequestBody MtlMastDto mtlMast) {
        try {
            MtlMastDto dto = this.mtlMastService.update(mtlMast);

            return ApiResponse.ok(dto);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    /**
     * 刪除
     *
     * @return	void
     */
    @DeleteMapping("{mtlNo}")
    public ApiResponse delete(@PathVariable String mtlNo) {
        try {
            this.mtlMastService.deleteById(mtlNo);
            return ApiResponse.ok();
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("{mtlNo}")
    public ApiResponse findById(@PathVariable("mtlNo") String xzz) {
        try {
            MtlMastDto dto = this.mtlMastService.findById(xzz);

            return ApiResponse.ok(dto);

        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("all")
    public ApiResponse findAll() {
        try {
            //List<OrdDto> dtoList = this.ordService.findAll();
            //return ApiResponse.ok(dtoList);

            List<String> idList = this.mtlMastService.findAllPk();
            return ApiResponse.ok(idList);
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
			List<String> idList = this.mtlMastService.query(params);
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
			List<String> idList = this.mtlMastService.findWindow(params);
			return ApiResponse.ok(idList);
		} catch (Exception ex) {
			return ApiResponse.error(ex.getMessage());
		}
	}
}
