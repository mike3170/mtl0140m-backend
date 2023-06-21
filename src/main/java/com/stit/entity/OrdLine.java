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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "ORD_LINE")
@NamedQueries({
	@NamedQuery(name = "OrdLine.findAll", query = "SELECT o FROM OrdLine o")})
public class OrdLine implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected OrdLinePK ordLinePK;
	@Basic(optional = false)
  @Column(name = "PROD_CODE")
	private String prodCode;
	@Basic(optional = false)
  @Column(name = "QTY")
	private long qty;
	// @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	@Basic(optional = false)
  @Column(name = "UNIT_PRICE")
	private BigDecimal unitPrice;

	public OrdLine() {
	}

	public OrdLine(OrdLinePK ordLinePK) {
		this.ordLinePK = ordLinePK;
	}

	public OrdLine(OrdLinePK ordLinePK, String prodCode, long qty, BigDecimal unitPrice) {
		this.ordLinePK = ordLinePK;
		this.prodCode = prodCode;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public OrdLine(String ordNo, short seq) {
		this.ordLinePK = new OrdLinePK(ordNo, seq);
	}

	public OrdLinePK getOrdLinePK() {
		return ordLinePK;
	}

	public void setOrdLinePK(OrdLinePK ordLinePK) {
		this.ordLinePK = ordLinePK;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public long getQty() {
		return qty;
	}

	public void setQty(long qty) {
		this.qty = qty;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (ordLinePK != null ? ordLinePK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof OrdLine)) {
			return false;
		}
		OrdLine other = (OrdLine) object;
		if ((this.ordLinePK == null && other.ordLinePK != null) || (this.ordLinePK != null && !this.ordLinePK.equals(other.ordLinePK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.stit.entity.OrdLine[ ordLinePK=" + ordLinePK + " ]";
	}
	
}
