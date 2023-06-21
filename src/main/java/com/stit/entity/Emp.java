package com.stit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMP")
public class Emp implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Column(name = "EMP_ID")
	private String empId;

  @Column(name = "FIRST_NAME")
	private String firstName;

  @Column(name = "LAST_NAME")
	private String lastName;

  @Column(name = "EMAIL")
	private String email;

  @Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "HIRE_DATE")
	private LocalDate hireDate;

  @Column(name = "JOB_ID")
	private String jobId;

  @Column(name = "SALARY")
	private int salary;

	@Column(name = "COMMISSION_PCT")
	private BigDecimal commissionPct;

	@Column(name = "CRE_TS")
  @Temporal(TemporalType.TIMESTAMP)
	private Date creTs;

	@JoinColumn(name = "DEPT_NO", referencedColumnName = "DEPT_NO")
  @ManyToOne
	private Dept deptNo;

	public Emp() {
	}

	public Emp(String empId) {
		this.empId = empId;
	}

	public Emp(String empId, String firstName, String lastName, String email, String phoneNumber, String jobId, int salary) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.jobId = jobId;
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public BigDecimal getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(BigDecimal commissionPct) {
		this.commissionPct = commissionPct;
	}

	public Date getCreTs() {
		return creTs;
	}

	public void setCreTs(Date creTs) {
		this.creTs = creTs;
	}

	public Dept getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Dept deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (empId != null ? empId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Emp)) {
			return false;
		}
		Emp other = (Emp) object;
		if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Emp{" + "empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary=" + salary + ", commissionPct=" + commissionPct + ", creTs=" + creTs + ", deptNo=" + deptNo + '}';
	}
	
}
