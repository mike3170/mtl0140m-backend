/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stit.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
@Table(name = "ORD")
@NamedQueries({
	@NamedQuery(name = "Ord.findAll", query = "SELECT o FROM Ord o")})
public class Ord implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ORD_NO")
	private String ordNo;
	@Basic(optional = false)
  @Column(name = "ORD_DATE")
  @Temporal(TemporalType.TIMESTAMP)
	private Date ordDate;
	@Basic(optional = false)
  @Column(name = "REQUIRED_DATE")
  @Temporal(TemporalType.TIMESTAMP)
	private Date requiredDate;
	@Column(name = "SHIPPED_DATE")
  @Temporal(TemporalType.TIMESTAMP)
	private Date shippedDate;
	@Basic(optional = false)
  @Column(name = "STATUS")
	private String status;
	@Column(name = "COMMENTS")
	private String comments;
	@Basic(optional = false)
  @Column(name = "CUST_NO")
	private String custNo;

	public Ord() {
	}

	public Ord(String ordNo) {
		this.ordNo = ordNo;
	}

	public Ord(String ordNo, Date ordDate, Date requiredDate, String status, String custNo) {
		this.ordNo = ordNo;
		this.ordDate = ordDate;
		this.requiredDate = requiredDate;
		this.status = status;
		this.custNo = custNo;
	}

	public String getOrdNo() {
		return ordNo;
	}

	public void setOrdNo(String ordNo) {
		this.ordNo = ordNo;
	}

	public Date getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}

	public Date getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (ordNo != null ? ordNo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Ord)) {
			return false;
		}
		Ord other = (Ord) object;
		if ((this.ordNo == null && other.ordNo != null) || (this.ordNo != null && !this.ordNo.equals(other.ordNo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.stit.entity.Ord[ ordNo=" + ordNo + " ]";
	}
	
}
