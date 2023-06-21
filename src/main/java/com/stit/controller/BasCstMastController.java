package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.dto.BasCstMastDto;
import com.stit.service.BasCstMastService;
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
@RequestMapping("/api/basCstmast")
public class BasCstMastController {

    @Autowired
    private BasCstMastService basCstMastService;

    @PersistenceContext
    private EntityManager em;

    @PostMapping("/insert")
    public ApiResponse insert(@RequestBody BasCstMastDto basCstMast) {
        try {
            this.basCstMastService.insert(basCstMast);

            return ApiResponse.ok("ok");
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    /**
     * 修改
     *
     * @param
     * @return
     */
    @PutMapping("/update")
    public ApiResponse update(@RequestBody BasCstMastDto basCstMast) {
        try {
            BasCstMastDto dto = this.basCstMastService.update(basCstMast);

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
    @DeleteMapping("{cstNo}")
    public ApiResponse delete(@PathVariable String cstNo) {
        try {
            this.basCstMastService.deleteById(cstNo);
            return ApiResponse.ok();
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("findbyid/{cstNo}")
    public ApiResponse findById(@PathVariable("cstNo") String xzz) {
        try {
            BasCstMastDto dto = this.basCstMastService.findById(xzz);
            return ApiResponse.ok(dto);

        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("all")
    public ApiResponse findAll() {
        try {
            List<BasCstMastDto> idList = this.basCstMastService.findAll();
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
			List<String> idList = this.basCstMastService.query(params);
			return ApiResponse.ok(idList);
		} catch (Exception ex) {
			return ApiResponse.error(ex.getMessage());
		}
	}

}
