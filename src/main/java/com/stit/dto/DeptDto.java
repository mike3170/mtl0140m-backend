package com.stit.dto;

import lombok.Data;

@Data
public class DeptDto {
	private String deptNo;
	private String deptName;
	private String loc;

	@Override
	public String toString() {
		return "DeptDto{" + "deptNo=" + deptNo + ", deptName=" + deptName + ", loc=" + loc + '}';
	}
	
}
