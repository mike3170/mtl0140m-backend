package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.dto.CodMastDto;
import com.stit.entity.CodMastPK;
import com.stit.service.CodMastService;
import com.stit.utils.sql.UrlUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/codmast")
public class CodMastController {

    @Autowired
    private CodMastService codMastService;
    
    @PersistenceContext
    private EntityManager em;

    @GetMapping("/findbykind/{codKind}")
    public ApiResponse findByKind(@PathVariable String codKind) {
        try {
            List<CodMastDto> dto = this.codMastService.findByKind(codKind);
            
            return ApiResponse.ok(dto);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }    
  
    @GetMapping("/getCodeName/{codKind}/{para}")
    public ApiResponse findByKind(@PathVariable String codKind, @PathVariable String para) {
        try {
            CodMastPK pk = new CodMastPK(codKind, para);
            String codeName = this.codMastService.getCodeName(pk);
            
            return ApiResponse.ok(codeName);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }        
    
    @GetMapping("/isexist/{codKind}/{para}")
    public ApiResponse existById(@PathVariable String codKind, @PathVariable String para) {
        try {

            String _para = UrlUtil.toUTF8(para);
            CodMastPK pk = new CodMastPK(codKind, _para);
            boolean isExist = this.codMastService.existById(pk);
            
            return ApiResponse.ok(isExist? "ok" : "");
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

}
