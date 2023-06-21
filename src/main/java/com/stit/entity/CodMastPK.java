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
public class CodMastPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "KIND")
    private String kind;
    @Basic(optional = false)
    @Column(name = "CODE_NO")
    private String codeNo;

    public CodMastPK() {
    }

    public CodMastPK(String kind, String codeNo) {
        this.kind = kind;
        this.codeNo = codeNo;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(String codeNo) {
        this.codeNo = codeNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kind != null ? kind.hashCode() : 0);
        hash += (codeNo != null ? codeNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CodMastPK)) {
            return false;
        }
        CodMastPK other = (CodMastPK) object;
        if ((this.kind == null && other.kind != null) || (this.kind != null && !this.kind.equals(other.kind))) {
            return false;
        }
        if ((this.codeNo == null && other.codeNo != null) || (this.codeNo != null && !this.codeNo.equals(other.codeNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.CodMastPK[ kind=" + kind + ", codeNo=" + codeNo + " ]";
    }
    
}
