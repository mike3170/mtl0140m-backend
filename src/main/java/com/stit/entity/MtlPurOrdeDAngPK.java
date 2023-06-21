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
public class MtlPurOrdeDAngPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PO_NO")
    private String poNo;
    @Basic(optional = false)
    @Column(name = "ITEM_NO")
    private short itemNo;

    public MtlPurOrdeDAngPK() {
    }

    public MtlPurOrdeDAngPK(String poNo, short itemNo) {
        this.poNo = poNo;
        this.itemNo = itemNo;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public short getItemNo() {
        return itemNo;
    }

    public void setItemNo(short itemNo) {
        this.itemNo = itemNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (poNo != null ? poNo.hashCode() : 0);
        hash += (int) itemNo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtlPurOrdeDAngPK)) {
            return false;
        }
        MtlPurOrdeDAngPK other = (MtlPurOrdeDAngPK) object;
        if ((this.poNo == null && other.poNo != null) || (this.poNo != null && !this.poNo.equals(other.poNo))) {
            return false;
        }
        if (this.itemNo != other.itemNo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.MtlPurOrdeDAngPK[ poNo=" + poNo + ", itemNo=" + itemNo + " ]";
    }
    
}
