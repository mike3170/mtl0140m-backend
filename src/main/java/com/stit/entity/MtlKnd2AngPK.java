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
 * @author mike
 */
@Embeddable
public class MtlKnd2AngPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MTL_NO1")
    private String mtlNo1;
    @Basic(optional = false)
    @Column(name = "MTL_NO2")
    private String mtlNo2;

    public MtlKnd2AngPK() {
    }

    public MtlKnd2AngPK(String mtlNo1, String mtlNo2) {
        this.mtlNo1 = mtlNo1;
        this.mtlNo2 = mtlNo2;
    }

    public String getMtlNo1() {
        return mtlNo1;
    }

    public void setMtlNo1(String mtlNo1) {
        this.mtlNo1 = mtlNo1;
    }

    public String getMtlNo2() {
        return mtlNo2;
    }

    public void setMtlNo2(String mtlNo2) {
        this.mtlNo2 = mtlNo2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtlNo1 != null ? mtlNo1.hashCode() : 0);
        hash += (mtlNo2 != null ? mtlNo2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtlKnd2AngPK)) {
            return false;
        }
        MtlKnd2AngPK other = (MtlKnd2AngPK) object;
        if ((this.mtlNo1 == null && other.mtlNo1 != null) || (this.mtlNo1 != null && !this.mtlNo1.equals(other.mtlNo1))) {
            return false;
        }
        if ((this.mtlNo2 == null && other.mtlNo2 != null) || (this.mtlNo2 != null && !this.mtlNo2.equals(other.mtlNo2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.MtlKnd2AngPK[ mtlNo1=" + mtlNo1 + ", mtlNo2=" + mtlNo2 + " ]";
    }
    
}
