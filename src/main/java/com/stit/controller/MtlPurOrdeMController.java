package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.dto.MtlMastDto;
import com.stit.dto.MtlPurOrdeMDto;
import com.stit.service.MtlMastService;
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

@RestController
@RequestMapping("/api/mtlpurordem")
public class MtlPurOrdeMController {

    @Autowired
    private MtlPurOrdeMService mtlPurOrdeMService;

    @PostMapping("/insert")
    public ApiResponse insert(@RequestBody MtlPurOrdeMDto mtlPurOrdeMDto) {
        try {
            this.mtlPurOrdeMService.insert(mtlPurOrdeMDto);

            return ApiResponse.ok("ok");
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @PutMapping("/update")
    public ApiResponse update(@RequestBody MtlPurOrdeMDto mtlPurOrdeMDto) {
        try {
            MtlPurOrdeMDto dto = this.mtlPurOrdeMService.update(mtlPurOrdeMDto);

            return ApiResponse.ok(dto);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @DeleteMapping("{poNo}")
    public ApiResponse delete(@PathVariable String mtlNo) {
        try {
            this.mtlPurOrdeMService.deleteById(mtlNo);
            return ApiResponse.ok();
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("{poNo}")
    public ApiResponse findById(@PathVariable("poNo") String xzz) {
        try {
            MtlPurOrdeMDto dto = this.mtlPurOrdeMService.findById(xzz);

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
            List<String> idList = this.mtlPurOrdeMService.findAllPk();
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
			List<String> idList = this.mtlPurOrdeMService.query(params);
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
			List<String> idList = this.mtlPurOrdeMService.findWindow(params);
			return ApiResponse.ok(idList);
		} catch (Exception ex) {
			return ApiResponse.error(ex.getMessage());
		}
	}
}
