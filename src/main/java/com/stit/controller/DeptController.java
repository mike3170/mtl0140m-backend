package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.domain.Dept;
import com.stit.dto.DeptDto;
import com.stit.service.DeptService;
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
@RequestMapping("/api/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	/**
	 * 新增
	 *
	 * @param dept
	 * @return
	 */
	@PostMapping()
	public ApiResponse insert(@RequestBody Dept dept) {
		try {
			DeptDto dto = this.deptService.insert(dept);
			return ApiResponse.ok(dto);
		} catch (Exception e) {
			return ApiResponse.error(e.getMessage());
		}
	}

	/**
	 * 修改
	 *
	 * @param dept
	 * @return
	 */
	@PutMapping()
	public ApiResponse update(@RequestBody Dept dept) {
		try {
			DeptDto dto = this.deptService.update(dept);
			return ApiResponse.ok(dto);
		} catch (Exception e) {
			return ApiResponse.error(e.getMessage());
		}
	}

	/**
	 * 刪除
	 *
	 * @param deptNo
	 * @return	void
	 */
	@DeleteMapping("{deptNo}")
	public ApiResponse delete(@PathVariable String deptNo) {
		try {
			this.deptService.deleteById(deptNo);
			return ApiResponse.ok();
		} catch (Exception e) {
			return ApiResponse.error(e.getMessage());
		}
	}

	@GetMapping("{deptNo}")
	public ApiResponse findById(@PathVariable String deptNo) {
		try {
			DeptDto dto = this.deptService.findById(deptNo);
			return ApiResponse.ok(dto);
		} catch (Exception e) {
			return ApiResponse.error(e.getMessage());
		}
	}

	@GetMapping("all")
	public ApiResponse findAll() {
		try {
			List<DeptDto> dtoList = this.deptService.findAll();
			return ApiResponse.ok(dtoList);
		} catch (Exception e) {
			return ApiResponse.error(e.getMessage());
		}
	}

	/**
	 * 查詢 matrix variable
	 */
	@GetMapping("query/{params}")
	public ApiResponse query(@MatrixVariable(pathVar = "params") Map<String, List<String>> params) {
		System.out.println("DeptController matrix: " + params);

		try {
			List<DeptDto> dtoList = this.deptService.query(params);
			return ApiResponse.ok(dtoList);
		} catch (Exception ex) {
			return ApiResponse.error(ex.getMessage());
		}
	}

} // end class
