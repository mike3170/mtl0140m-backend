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
public class BasCstMastD3PK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CST_NO")
    private String cstNo;
    @Basic(optional = false)
    @Column(name = "ITEM_NO")
    private short itemNo;

    public BasCstMastD3PK() {
    }

    public BasCstMastD3PK(String cstNo, short itemNo) {
        this.cstNo = cstNo;
        this.itemNo = itemNo;
    }

    public String getCstNo() {
        return cstNo;
    }

    public void setCstNo(String cstNo) {
        this.cstNo = cstNo;
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
        hash += (cstNo != null ? cstNo.hashCode() : 0);
        hash += (int) itemNo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BasCstMastD3PK)) {
            return false;
        }
        BasCstMastD3PK other = (BasCstMastD3PK) object;
        if ((this.cstNo == null && other.cstNo != null) || (this.cstNo != null && !this.cstNo.equals(other.cstNo))) {
            return false;
        }
        if (this.itemNo != other.itemNo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.BasCstMastD3PK[ cstNo=" + cstNo + ", itemNo=" + itemNo + " ]";
    }
    
}
