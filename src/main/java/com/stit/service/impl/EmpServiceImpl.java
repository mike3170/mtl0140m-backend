package com.stit.service.impl;

import com.stit.common.ResourceExistsException;
import com.stit.common.ResourceNotFoundException;
import com.stit.dao.DeptDao;
import com.stit.dao.EmpDao;
import com.stit.dao2domain.EmpDomain;
import com.stit.domain.Dept;
import com.stit.domain.Emp;
import com.stit.dto.EmpDto;
import com.stit.service.EmpService;
import com.stit.utils.sql.SqlUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static java.util.stream.Collectors.toList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;

    @Autowired
    private DeptDao deptDao;

    @Autowired
    private SqlUtil sqlUtil;

    @Override
    public EmpDto insert(Emp emp) {
        boolean isExists = this.empDao.exists(emp);

        this.empDao.insert(emp);
//問一下老師

        Optional<Emp> opt = this.empDao.findById(emp.getEmpId());

//        Emp emp1 = opt.get();
//        System.out.println("hire"+emp1);
        EmpDto empDto = this.fillEmpDto(opt.get());
        System.out.println("here4");
        return empDto;
    }

    @Override
    public EmpDto update(Emp emp) {
        boolean isExists = this.empDao.existsById(emp.getEmpId());
        if (!isExists) {
            throw new ResourceNotFoundException();
        }

        this.empDao.update(emp);

        Optional<Emp> opt = this.empDao.findById(emp.getEmpId());

        if (opt.isPresent()) {
            EmpDto empDto = this.fillEmpDto(emp);
            return empDto;
        } else {
            throw new ResourceNotFoundException("Update 失敗");
        }

//		Optional<Emp> opt = this.empDao.findById(emp.getEmpId());
//		EmpDto dto
//			= opt.map(this::fillEmpDto)
//				.orElseThrow(() -> new ResourceNotFoundException());        
    }

    @Override
    public void deleteById(String empId) {
        boolean isExists = this.empDao.existsById(empId);
        if (!isExists) {
            throw new ResourceNotFoundException("查無此筆資料不可刪除");
        }

        this.empDao.deleteById(empId);

        Optional<Emp> opt = this.empDao.findById(empId);

        if (opt.isPresent()) {
            throw new ResourceExistsException("刪除失敗");
        }

    }

    @Override
    public EmpDto findById(String empId) {
        boolean isExists = this.empDao.existsById(empId);
        if (!isExists) {
            throw new ResourceNotFoundException("查無此筆資料");
        }

        this.empDao.findById(empId);

        Optional<Emp> opt = this.empDao.findById(empId);
        if (opt.isPresent()) {
            EmpDto empDto = this.fillEmpDto(opt.get());
            return empDto;
        } else {
            throw new ResourceNotFoundException("資料不存在");
        }
    }

    @Override
    public List<EmpDto> findAll() {
        List<Emp> empList = this.empDao.findAll();

//        List<EmpDto> empDto = empList.stream().map(EmpDomain::fillEmpDomain).collect(toList());
        List<EmpDto> empDtoList = new ArrayList();
        for (Emp emp : empList) {
            EmpDto empDto = this.fillEmpDto(emp);
            empDtoList.add(empDto);
        }
        return empDtoList;
    }

    @Override
    public List<EmpDto> Query(Map<String, List<String>> params) {
        String sql = sqlUtil.toSql(Emp.class, params, "emp_id");
        List<Emp> empList = this.empDao.query(sql);

        List<EmpDto> dtoList
                = empList
                        .stream()
                        .map(this::fillEmpDto)
                        .collect(toList());

        return dtoList;
    }

    private EmpDto fillEmpDto(Emp emp) {

        EmpDto empDto = new EmpDto();
        Dept dept = new Dept();
        empDto.setEmpId(emp.getEmpId());
        empDto.setFirstName(emp.getFirstName());
        empDto.setLastName(emp.getLastName());
        empDto.setEmail(emp.getEmail());
        empDto.setPhoneNumber(emp.getPhoneNumber());
        empDto.setHireDate(emp.getHireDate());
        empDto.setJobId(emp.getJobId());
        empDto.setSalary(emp.getSalary());
        empDto.setCommissionPct(emp.getCommissionPct());
        empDto.setCreTs(emp.getCreTs());
        empDto.setDeptNo(emp.getDeptNo());
        Optional<Dept> opt = this.deptDao.findById(emp.getDeptNo());
        if (opt.isPresent()) {
            empDto.setDeptName(dept.getDeptName());
        } else {
            throw new ResourceNotFoundException("查無此部門資料");
        }
        return empDto;
    }

    @Override
    public Boolean existById(String empId) {
        Boolean isExist = this.empDao.existsById(empId);

        return isExist;
    }

}
