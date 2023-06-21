package com.stit.domain;

import java.util.Objects;

public class Dept {
	private String deptNo;
	private String deptName;
	private String loc;

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

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 23 * hash + Objects.hashCode(this.deptNo);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Dept other = (Dept) obj;
		if (!Objects.equals(this.deptNo, other.deptNo)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Dept{" + "deptNo=" + deptNo + ", deptName=" + deptName + ", loc=" + loc + '}';
	}
	
	
}
