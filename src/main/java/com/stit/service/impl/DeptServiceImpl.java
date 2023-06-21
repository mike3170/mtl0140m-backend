package com.stit.service.impl;

import com.stit.common.ResourceExistsException;
import com.stit.common.ResourceNotFoundException;
import com.stit.dao.DeptDao;
import com.stit.domain.Dept;
import com.stit.dto.DeptDto;
import com.stit.service.DeptService;
import com.stit.utils.sql.SqlUtil;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static java.util.stream.Collectors.toList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Autowired
	private SqlUtil sqlUtil;

	/**
	 * 新增
	 *
	 * @param dept
	 * @return
	 */
	@Override
	public DeptDto insert(Dept dept) {
		boolean isExists = this.deptDao.existsById(dept.getDeptNo());
		if (isExists) {
			throw new ResourceExistsException();
		}

		this.deptDao.insert(dept);

		Optional<Dept> opt = this.deptDao.findById(dept.getDeptNo());

		DeptDto dto
			= opt.map(this::asDto)
				.orElseThrow(() -> new ResourceNotFoundException());

		return dto;
	}

	/**
	 * 修改
	 *
	 * @param dept
	 * @return
	 */
	@Override
	public DeptDto update(Dept dept) {
		boolean isExists = this.deptDao.existsById(dept.getDeptNo());
		if (!isExists) {
			throw new ResourceNotFoundException();
		}

		this.deptDao.update(dept);

		Optional<Dept> opt = this.deptDao.findById(dept.getDeptNo());
		DeptDto dto
			= opt.map(this::asDto)
				.orElseThrow(() -> new ResourceNotFoundException());

		return dto;
	}

	/**
	 * 刪除
	 *
	 * @param deptNo
	 */
	@Override
	public void deleteById(String deptNo) {
		boolean isExists = this.deptDao.existsById(deptNo);
		if (!isExists) {
			throw new ResourceNotFoundException();
		}

		this.deptDao.deleteById(deptNo);
	}

	/**
	 * 查一筆
	 *
	 * @param deptNo
	 * @return
	 */
	@Override
	public DeptDto findById(String deptNo) {
		Optional<Dept> opt = this.deptDao.findById(deptNo);

		DeptDto dto
			= opt.map(this::asDto)
				.orElseThrow(() -> new ResourceNotFoundException("dept no:" + deptNo));

		return dto;
	}

	/**
	 * 查全部
	 *
	 * @param deptNo
	 * @return
	 */
	@Override
	public List<DeptDto> findAll() {
		List<Dept> deptList = this.deptDao.findAll();
		List<DeptDto> dtoList
			= deptList.stream()
				.map(this::asDto)
				.collect(toList());

		return dtoList;
	}

	/**
	 * 查詢
	 *
	 * @param params
	 * @return
	 */
	@Override
	public List<DeptDto> query(Map<String, List<String>> params) {
		String sql = sqlUtil.toSql(Dept.class, params, "dept_no");
		System.out.println(sql);

		List<Dept> deptList = this.deptDao.query(sql);

		List<DeptDto> dtoList
			= deptList
				.stream()
				.map(this::asDto)
				.collect(toList());

		return dtoList;
	}

	private DeptDto asDto(Dept dept) {
		DeptDto dto = new DeptDto();
		dto.setDeptNo(dept.getDeptNo());
		dto.setDeptName(dept.getDeptName());
		dto.setLoc(dept.getLoc());
		return dto;
	}

} // end class
