package com.stit.dao2domain;

import com.stit.domain.Emp;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDomain {
  public static Emp fillEmpDomain(ResultSet rs, int i) throws SQLException {
      Emp emp = new Emp();
      emp.setEmpId(rs.getString("emp_id"));
      emp.setFirstName(rs.getString("first_name"));
      emp.setLastName(rs.getString("last_name"));
      emp.setEmail(rs.getString("email"));
      emp.setPhoneNumber(rs.getString("phone_number"));
      emp.setHireDate(rs.getDate("hire_date").toLocalDate());
      emp.setJobId(rs.getString("job_id"));
      emp.setSalary(rs.getInt("salary"));
      emp.setCommissionPct(rs.getBigDecimal("commission_pct"));
      emp.setCreTs(rs.getDate("cre_ts").toLocalDate());
      emp.setDeptNo(rs.getString("dept_no"));
      
      return emp;
   }
}
