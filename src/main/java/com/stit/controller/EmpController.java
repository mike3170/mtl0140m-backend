package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.domain.Emp;
import com.stit.dto.EmpDto;
import com.stit.service.EmpService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @PostMapping("/insert")
    public ApiResponse insert(@RequestBody Emp emp) {
        System.out.println("hiredate:" + emp.getHireDate());
        try {
            EmpDto empdto = this.empService.insert(emp);
            return ApiResponse.ok(empdto);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @PostMapping("/update")
    public ApiResponse update(@RequestBody Emp emp) {
        try {
            System.out.println("hello");
            EmpDto empDto = this.empService.update(emp);
            return ApiResponse.ok(empDto);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @DeleteMapping("/delete/{empId}")
    public ApiResponse Delete(@PathVariable String empId) {
        try {
            this.empService.deleteById(empId);
            return ApiResponse.ok("刪除完成");
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("all")
    public ApiResponse findAll() {
        try {
            List<EmpDto> dtoList = this.empService.findAll();
            return ApiResponse.ok(dtoList);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("/findbyid/{empId}")
    public ApiResponse findById(@PathVariable String empId) {
        try {
            EmpDto dto = this.empService.findById(empId);
            return ApiResponse.ok(dto);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("/existbyid/{empId}")
    public ApiResponse existsById(@PathVariable String empId) {
        try {
            Boolean isExist = this.empService.existById(empId);
            return ApiResponse.ok(isExist);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

    @GetMapping("query/{params}")
    public ApiResponse query(@MatrixVariable(pathVar = "params") Map<String, List<String>> params) {
        try {
            List<EmpDto> dtoList = this.empService.Query(params);
            return ApiResponse.ok(dtoList);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }

}
