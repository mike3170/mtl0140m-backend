package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.dto.MtlKnd1Dto;
import com.stit.service.MtlKnd1Service;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mtlknd1")
public class MtlKnd1Controller {

    @Autowired
    private MtlKnd1Service mtlKnd1Service;

    @PersistenceContext
    private EntityManager em;

    @PostMapping("/insert")
    public ApiResponse insert(@RequestBody MtlKnd1Dto mtlKnd1) {
        try {
            this.mtlKnd1Service.insert(mtlKnd1);

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
    @PutMapping()
    public ApiResponse update(@RequestBody MtlKnd1Dto mtlKnd1) {
        try {
            MtlKnd1Dto dto = this.mtlKnd1Service.update(mtlKnd1);

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
    @DeleteMapping("{mtlNo1}")
    public ApiResponse delete(@PathVariable String mtlNo1) {
        try {
            this.mtlKnd1Service.deleteById(mtlNo1);
            return ApiResponse.ok();
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("{mtlNo1}")
    public ApiResponse findById(@PathVariable String mtlNo1) {
        try {
            MtlKnd1Dto dto = this.mtlKnd1Service.findById(mtlNo1);
            return ApiResponse.ok(dto);
            //return ApiResponse.ok("hello");
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }
    
    @GetMapping("isexist/{mtlNo1}")
    public ApiResponse existById(@PathVariable String mtlNo1) {
        try {
            boolean isExist = this.mtlKnd1Service.existById(mtlNo1);

            return ApiResponse.ok(isExist);

        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }    

    @GetMapping("all")
    public ApiResponse findAll() {
        try {
            //List<OrdDto> dtoList = this.ordService.findAll();
            //return ApiResponse.ok(dtoList);

            List<MtlKnd1Dto> idList = this.mtlKnd1Service.findAll();
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
			List<String> idList = this.mtlKnd1Service.query(params);
			return ApiResponse.ok(idList);
		} catch (Exception ex) {
			return ApiResponse.error(ex.getMessage());
		}
	}
}
