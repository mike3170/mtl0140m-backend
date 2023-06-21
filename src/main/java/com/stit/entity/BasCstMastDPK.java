/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stit.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author mike
 */
@Embeddable
public class BasCstMastDPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CST_NO")
    private String cstNo;
    @Basic(optional = false)
    @Column(name = "SEQ_NO")
    private short seqNo;

    public BasCstMastDPK() {
    }

    public BasCstMastDPK(String cstNo, short seqNo) {
        this.cstNo = cstNo;
        this.seqNo = seqNo;
    }

    public String getCstNo() {
        return cstNo;
    }

    public void setCstNo(String cstNo) {
        this.cstNo = cstNo;
    }

    public short getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(short seqNo) {
        this.seqNo = seqNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cstNo != null ? cstNo.hashCode() : 0);
        hash += (int) seqNo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BasCstMastDPK)) {
            return false;
        }
        BasCstMastDPK other = (BasCstMastDPK) object;
        if ((this.cstNo == null && other.cstNo != null) || (this.cstNo != null && !this.cstNo.equals(other.cstNo))) {
            return false;
        }
        if (this.seqNo != other.seqNo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.BasCstMastDPK[ cstNo=" + cstNo + ", seqNo=" + seqNo + " ]";
    }
    
}
