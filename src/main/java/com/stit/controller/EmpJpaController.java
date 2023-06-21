package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.entity.DeptJpa;
import com.stit.entity.EmpJpa;
import com.stit.service.EmpJpaService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jpa/emp")
public class EmpJpaController {

    @Autowired
    private EmpJpaService empJpaService;
    
    @PersistenceContext
    private EntityManager em;

    @PostMapping("/insert")
    public ApiResponse insert(@RequestBody EmpJpa emp) {
        try {
            this.empJpaService.insert(emp);
            
            return ApiResponse.ok("ok");
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

}
