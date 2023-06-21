package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.dao.DeptDao;
import com.stit.domain.Dept;
import com.stit.entity.CodMast;
import com.stit.entity.CodMastPK;
import com.stit.repositoty.CodMastRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

	@Autowired
	private DeptDao deptDao;

	@GetMapping()
	public ApiResponse test() {
		List<String> list = List.of("google", "amazon");
		return ApiResponse.ok(list);
	}
        
        
	@GetMapping("dept")
	public ApiResponse testDept() {
		System.out.println("-------------------------------");
		Dept dept = new Dept();
		dept.setDeptNo("test");
		dept.setDeptName("xxx");
		dept.setLoc("yyy");
		//deptDao.insert(dept);
		//System.out.println("ok");

		//deptDao.deleteById("test");
		deptDao.delete(dept);

		return ApiResponse.ok("ok");
	}




}
