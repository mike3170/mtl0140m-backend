package com.stit.dao.impl;

import com.stit.domain.Dept;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import com.stit.dao.DeptDao;
import org.springframework.jdbc.core.RowMapper;

@Repository
public class DeptDaoImpl implements DeptDao {

	@Autowired
	private JdbcTemplate jdbc;

	@Autowired
	private NamedParameterJdbcTemplate jdbc2;

	@Override
	public void insert(Dept dept) {
		String sql 
			= "insert into dept(dept_no, dept_name, loc)" 
			+ " values (:dept_no, :dept_name, :loc)"; 

		Map<String, String> param = new HashMap<>();
		param.put("dept_no", dept.getDeptNo());
		param.put("dept_name", dept.getDeptName());
		param.put("loc", dept.getLoc());

		jdbc2.update(sql, param);
	}

	@Override
	public void update(Dept dept) {
		String sql 
			= "update dept set " 
			+ " dept_name = ?,"
			+ " loc = ?"
			+ " where dept_no = ?";

		this.jdbc.update(sql, 
			dept.getDeptName(), 
			dept.getLoc(), 
			dept.getDeptNo());
	}

	@Override
	public void deleteById(String id) {
		String sql = "delete from dept where dept_no = ?";
		int count = this.jdbc.update(sql, id);
	}

	@Override
	public void delete(Dept dept) {
		this.deleteById(dept.getDeptNo());
	}

	@Override
	public List<Dept> query(String sql) {
		List<Dept> deptList = this.jdbc.query(sql, this::asDept);
		return deptList;
	}

	@Override
	public boolean exists(Dept dept) {
		return this.existsById(dept.getDeptNo());
	}

	@Override
	public boolean existsById(String id) {
		String sql = "select count(*) from dept where dept_no = ?";
		Long count = this.jdbc.queryForObject(sql, Long.class, id);
		return count > 0;
	}

	@Override
	public long count() {
		String sql = "select count(*) from dept";
		Long count = this.jdbc.queryForObject(sql, Long.class);
		return count;
	}

	@Override
	public Optional<Dept> findById(String deptNo) {
		String sql = "select * from dept where dept_no = ?";

		try {
			Dept dept = this.jdbc.queryForObject(sql, this::asDept, deptNo);
			return Optional.of(dept);
		} catch (Exception e) {
			return Optional.empty();
		}
	}

	@Override
	public List<Dept> findAll() {
		String sql = "select * from dept order by dept_no";
		List<Dept> list = this.jdbc.query(sql, this::asDept);

		return list;
	}

	private Dept asDept(ResultSet rs, int i) throws SQLException {
		Dept dept = new Dept();
		dept.setDeptNo(rs.getString("dept_no"));
		dept.setDeptName(rs.getString("dept_name"));
		dept.setLoc(rs.getString("loc"));
		return dept;
	}


}
