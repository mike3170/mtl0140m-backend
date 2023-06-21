/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "CUST_NO")
	private String custNo;
	@Basic(optional = false)
  @Column(name = "CUST_NAME")
	private String custName;
	@Basic(optional = false)
  @Column(name = "CONTACT_LASTNAME")
	private String contactLastname;
	@Basic(optional = false)
  @Column(name = "CONTACT_FIRSTNAME")
	private String contactFirstname;
	@Basic(optional = false)
  @Column(name = "PHONE")
	private String phone;
	@Basic(optional = false)
  @Column(name = "ADDRESS1")
	private String address1;
	@Column(name = "ADDRESS2")
	private String address2;
	@Basic(optional = false)
  @Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "POSTAL_CODE")
	private String postalCode;
	@Basic(optional = false)
  @Column(name = "COUNTRY")
	private String country;
	@Column(name = "SALES_REP_EMP_NO")
	private Long salesRepEmpNo;
	// @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	@Column(name = "CREDIT_LIMIT")
	private BigDecimal creditLimit;

	public Customer() {
	}

	public Customer(String custNo) {
		this.custNo = custNo;
	}

	public Customer(String custNo, String custName, String contactLastname, String contactFirstname, String phone, String address1, String city, String country) {
		this.custNo = custNo;
		this.custName = custName;
		this.contactLastname = contactLastname;
		this.contactFirstname = contactFirstname;
		this.phone = phone;
		this.address1 = address1;
		this.city = city;
		this.country = country;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getContactLastname() {
		return contactLastname;
	}

	public void setContactLastname(String contactLastname) {
		this.contactLastname = contactLastname;
	}

	public String getContactFirstname() {
		return contactFirstname;
	}

	public void setContactFirstname(String contactFirstname) {
		this.contactFirstname = contactFirstname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getSalesRepEmpNo() {
		return salesRepEmpNo;
	}

	public void setSalesRepEmpNo(Long salesRepEmpNo) {
		this.salesRepEmpNo = salesRepEmpNo;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (custNo != null ? custNo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) object;
		if ((this.custNo == null && other.custNo != null) || (this.custNo != null && !this.custNo.equals(other.custNo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.stit.entity.Customer[ custNo=" + custNo + " ]";
	}
	
}
