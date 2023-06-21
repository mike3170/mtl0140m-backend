package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.dto.BasVenMastDto;
import com.stit.service.BasVenMastService;
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
@RequestMapping("/api/basvenmast")
public class BasVenMastController {

    @Autowired
    private BasVenMastService basVenMastService;

    @PersistenceContext
    private EntityManager em;

    @PostMapping("/insert")
    public ApiResponse insert(@RequestBody BasVenMastDto basVenMast) {
        try {
            this.basVenMastService.insert(basVenMast);

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
    public ApiResponse update(@RequestBody BasVenMastDto basVenMast) {
        try {
            BasVenMastDto dto = this.basVenMastService.update(basVenMast);

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
    @DeleteMapping("{venNo}")
    public ApiResponse delete(@PathVariable String venNo) {
        try {
            this.basVenMastService.deleteById(venNo);
            return ApiResponse.ok();
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("{venNo}")
    public ApiResponse findById(@PathVariable("venNo") String xzz) {
        try {
            BasVenMastDto dto = this.basVenMastService.findById(xzz);

            return ApiResponse.ok(dto);

        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("all")
    public ApiResponse findAll() {
        try {
            List<String> idList = this.basVenMastService.findAllPk();
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
			List<String> idList = this.basVenMastService.query(params);
			return ApiResponse.ok(idList);
		} catch (Exception ex) {
			return ApiResponse.error(ex.getMessage());
		}
	}
        
	/**
	 * Find Window
	 */
	@GetMapping("findwindow/{venNoB}/{venNoE}")
	public ApiResponse findWindow(@PathVariable String venNoB, @PathVariable String venNoE) {
		try {
			List<String> idList = this.basVenMastService.findWindow(venNoB, venNoE);
			return ApiResponse.ok(idList);
		} catch (Exception ex) {
			return ApiResponse.error(ex.getMessage());
		}
	}
}
