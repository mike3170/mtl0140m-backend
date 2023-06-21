package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.dto.MtlKnd2Dto;
import com.stit.entity.MtlKnd2AngPK;
import com.stit.service.MtlKnd2Service;
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
@RequestMapping("/api/mtlknd2")
public class MtlKnd2Controller {

    @Autowired
    private MtlKnd2Service mtlKnd2Service;

    @PersistenceContext
    private EntityManager em;

    @PostMapping("/insert")
    public ApiResponse insert(@RequestBody MtlKnd2Dto mtlKnd2) {
        try {
            this.mtlKnd2Service.insert(mtlKnd2);

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
    public ApiResponse update(@RequestBody MtlKnd2Dto mtlKnd1) {
        try {
            MtlKnd2Dto dto = this.mtlKnd2Service.update(mtlKnd1);

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
    @DeleteMapping("{mtlNo1}/{mtlNo2}")
    public ApiResponse delete(@PathVariable String mtlNo1, @PathVariable String mtlNo2) {
        try {
            MtlKnd2AngPK pk = new MtlKnd2AngPK(mtlNo1, mtlNo2);
            
            this.mtlKnd2Service.deleteById(pk);
            return ApiResponse.ok();
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("{mtlNo1}/{mtlNo2}")
    public ApiResponse findById(@PathVariable String mtlNo1, @PathVariable String mtlNo2) {
        try {
            MtlKnd2AngPK pk = new MtlKnd2AngPK(mtlNo1, mtlNo2);
            MtlKnd2Dto dto = this.mtlKnd2Service.findById(pk);

            return ApiResponse.ok(dto);

        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("isexist/{mtlNo1}/{mtlNo2}")
    public ApiResponse existById(@PathVariable String mtlNo1, @PathVariable String mtlNo2) {
        try {
            MtlKnd2AngPK pk = new MtlKnd2AngPK(mtlNo1, mtlNo2);
            boolean isExist = this.mtlKnd2Service.existById(pk);

            return ApiResponse.ok(isExist);

        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }      
    
    @GetMapping("findbymtlno1/{mtlNo1}")
    public ApiResponse findByMtlNo1(@PathVariable String mtlNo1) {
        try {
            List<MtlKnd2Dto> mtlKnd2Dto = this.mtlKnd2Service.findByMtlNo1(mtlNo1);

            return ApiResponse.ok(mtlKnd2Dto);

        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }      
    
    @GetMapping("all")
    public ApiResponse findAll() {
        try {
            //List<OrdDto> dtoList = this.ordService.findAll();
            //return ApiResponse.ok(dtoList);

            List<MtlKnd2Dto> idList = this.mtlKnd2Service.findAll();
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
			List<String> idList = this.mtlKnd2Service.query(params);
			return ApiResponse.ok(idList);
		} catch (Exception ex) {
			return ApiResponse.error(ex.getMessage());
		}
	}
}
