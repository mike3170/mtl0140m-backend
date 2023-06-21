package com.stit.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEPT")
public class Dept implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
  @Column(name = "DEPT_NO")
	private String deptNo;

  @Column(name = "DEPT_NAME")
	private String deptName;

  @Column(name = "LOC")
	private String loc;

	@OneToMany(mappedBy = "deptNo")
	private List<Emp> empList;

	public Dept() {
	}

	public Dept(String deptNo) {
		this.deptNo = deptNo;
	}

	public Dept(String deptNo, String deptName, String loc) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.loc = loc;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<Emp> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (deptNo != null ? deptNo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Dept)) {
			return false;
		}
		Dept other = (Dept) object;
		if ((this.deptNo == null && other.deptNo != null) || (this.deptNo != null && !this.deptNo.equals(other.deptNo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.stit.entity.Dept[ deptNo=" + deptNo + " ]";
	}
	
}
