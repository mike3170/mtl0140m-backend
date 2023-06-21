/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stit.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author User
 */
@Embeddable
public class OrdLinePK implements Serializable {

	@Basic(optional = false)
  @Column(name = "ORD_NO")
	private String ordNo;
	@Basic(optional = false)
  @Column(name = "SEQ")
	private short seq;

	public OrdLinePK() {
	}

	public OrdLinePK(String ordNo, short seq) {
		this.ordNo = ordNo;
		this.seq = seq;
	}

	public String getOrdNo() {
		return ordNo;
	}

	public void setOrdNo(String ordNo) {
		this.ordNo = ordNo;
	}

	public short getSeq() {
		return seq;
	}

	public void setSeq(short seq) {
		this.seq = seq;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (ordNo != null ? ordNo.hashCode() : 0);
		hash += (int) seq;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof OrdLinePK)) {
			return false;
		}
		OrdLinePK other = (OrdLinePK) object;
		if ((this.ordNo == null && other.ordNo != null) || (this.ordNo != null && !this.ordNo.equals(other.ordNo))) {
			return false;
		}
		if (this.seq != other.seq) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.stit.entity.OrdLinePK[ ordNo=" + ordNo + ", seq=" + seq + " ]";
	}
	
}
