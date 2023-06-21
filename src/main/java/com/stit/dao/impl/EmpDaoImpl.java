package com.stit.dao.impl;

import com.stit.dao.EmpDao;
import com.stit.dao2domain.EmpDomain;
import com.stit.domain.Emp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao {

    @Autowired
    private JdbcTemplate jdbc;

    @Autowired
    private NamedParameterJdbcTemplate jdbc2;

    @Override
    public void insert(Emp emp) {
        String sql = "INSERT INTO emp(emp_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, cre_ts, dept_no)"
                            + "VALUES(:emp_id, :first_name, :last_name, :email, :phone_number, :hire_date, :job_id, :salary, :commission_pct, :cre_ts, :dept_no)";
        Map<String, Object> para = new HashMap<>();

        
        Date creaDate = new Date();
        para.put("emp_id", emp.getEmpId());
        para.put("first_name", emp.getFirstName());
        para.put("last_name", emp.getLastName());
        para.put("email", emp.getEmail());
        para.put("phone_number", emp.getPhoneNumber());
        para.put("hire_date", emp.getHireDate());
        para.put("job_id", emp.getJobId());
        para.put("salary", emp.getSalary());
        para.put("commission_pct", emp.getCommissionPct());
        para.put("cre_ts", creaDate);
        para.put("dept_no", emp.getDeptNo());
        
        this.jdbc2.update(sql, para);
    }

    @Override
    public void update(Emp emp) {      
        String sql
                = "UPDATE emp "
                + "SET first_name = ?, "
                + "last_name = ?, "
                + "email = ?, "
                + "phone_number= ?, "
                + "hire_date = ?, "
                + "job_id = ?, "
                + "salary = ?, "
                + "commission_pct = ?, "
                + "dept_no = ? "
                + "WHERE emp_id = ? ";

        Map<String, Object> para = new HashMap<>();
        
        this.jdbc.update(sql, emp.getFirstName(),
                emp.getLastName(),
                emp.getEmail(),
                emp.getPhoneNumber(),
                emp.getHireDate(),
                emp.getJobId(),
                emp.getSalary(),
                emp.getCommissionPct(),
                emp.getDeptNo(),
                emp.getEmpId());
    }

    @Override
    public void deleteById(String id) {
        String sql = "DELETE emp "
                + "WHERE emp_id = ?";

        this.jdbc.update(sql, id);
    }

    @Override
    public void delete(Emp emp) {
        this.deleteById(emp.getEmpId());
    }

    @Override
    public List<Emp> query(String sql) {
        List<Emp> empList = this.jdbc.query(sql, this::asEmp);
        return empList;
    }

    @Override
    public boolean existsById(String id) {
        String sql = "SELECT COUNT(*) FROM emp WHERE emp_id = ?";
        Integer count = this.jdbc.queryForObject(sql, Integer.class, id);

        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean exists(Emp emp) {
        return this.existsById(emp.getEmpId());
    }

    @Override
    public long count() {
        String sql = "SELECT COUNT(*) FROM emp";
        Integer count = this.jdbc.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<Emp> findAll() {
        String sql = "select * from emp order by emp_id";
        List<Emp> list = this.jdbc.query(sql, this::asEmp);
//		List<Emp> list = this.jdbc.query(sql, EmpDomain::fillEmpDomain);

        return list;
    }

    @Override
    public Optional<Emp> findById(String id) {
        String sql = "SELECT * FROM emp WHERE emp_id = ?";
        try {
            Emp emp = this.jdbc.queryForObject(sql, this::asEmp, id);           
//            Emp emp = this.jdbc.queryForObject(sql, EmpDomain::fillEmpDomain, id);
            return Optional.of(emp);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    private Emp asEmp(ResultSet rs, int i) throws SQLException {
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
