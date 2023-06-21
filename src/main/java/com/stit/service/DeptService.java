package com.stit.service;

import com.stit.domain.Dept;
import com.stit.dto.DeptDto;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * xxxx
 * @author User
 */
public interface DeptService {
	DeptDto insert(Dept dept);
	DeptDto update(Dept dept);
	void deleteById(String deptNo);

	DeptDto findById(String deptNo);
	List<DeptDto> findAll();

	// 查詢
	List<DeptDto> query(Map<String, List<String>> params);
	
}
