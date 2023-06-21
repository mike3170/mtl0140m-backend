package com.stit.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;

@Data
public class EmpDto {
	private String empId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate hireDate;
	private String jobId;
	private Integer salary;
	private BigDecimal commissionPct;
	private LocalDate creTs;
	private String deptNo;
	private String deptName;
}
