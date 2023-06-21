/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stit.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mike
 */
@Entity
@Table(name = "MTL_KND1_ANG")
@NamedQueries({
    @NamedQuery(name = "MtlKnd1Ang.findAll", query = "SELECT m FROM MtlKnd1Ang m"),
    @NamedQuery(name = "MtlKnd1Ang.findByMtlNo1", query = "SELECT m FROM MtlKnd1Ang m WHERE m.mtlNo1 = :mtlNo1"),
    @NamedQuery(name = "MtlKnd1Ang.findByKnd1Name", query = "SELECT m FROM MtlKnd1Ang m WHERE m.knd1Name = :knd1Name"),
    @NamedQuery(name = "MtlKnd1Ang.findByStkKind", query = "SELECT m FROM MtlKnd1Ang m WHERE m.stkKind = :stkKind"),
    @NamedQuery(name = "MtlKnd1Ang.findByEditDate", query = "SELECT m FROM MtlKnd1Ang m WHERE m.editDate = :editDate"),
    @NamedQuery(name = "MtlKnd1Ang.findByEditEmp", query = "SELECT m FROM MtlKnd1Ang m WHERE m.editEmp = :editEmp"),
    @NamedQuery(name = "MtlKnd1Ang.findByCreaDate", query = "SELECT m FROM MtlKnd1Ang m WHERE m.creaDate = :creaDate"),
    @NamedQuery(name = "MtlKnd1Ang.findByCreaEmp", query = "SELECT m FROM MtlKnd1Ang m WHERE m.creaEmp = :creaEmp")})
public class MtlKnd1Ang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MTL_NO1")
    private String mtlNo1;
    @Column(name = "KND1_NAME")
    private String knd1Name;
    @Basic(optional = false)
    @Column(name = "STK_KIND")
    private String stkKind;
    @Column(name = "EDIT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date editDate;
    @Column(name = "EDIT_EMP")
    private String editEmp;
    @Column(name = "CREA_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creaDate;
    @Column(name = "CREA_EMP")
    private String creaEmp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mtlKnd1Ang")
    private Collection<MtlKnd2Ang> mtlKnd2AngCollection;

    public MtlKnd1Ang() {
    }

    public MtlKnd1Ang(String mtlNo1) {
        this.mtlNo1 = mtlNo1;
    }

    public MtlKnd1Ang(String mtlNo1, String stkKind) {
        this.mtlNo1 = mtlNo1;
        this.stkKind = stkKind;
    }

    public String getMtlNo1() {
        return mtlNo1;
    }

    public void setMtlNo1(String mtlNo1) {
        this.mtlNo1 = mtlNo1;
    }

    public String getKnd1Name() {
        return knd1Name;
    }

    public void setKnd1Name(String knd1Name) {
        this.knd1Name = knd1Name;
    }

    public String getStkKind() {
        return stkKind;
    }

    public void setStkKind(String stkKind) {
        this.stkKind = stkKind;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public String getEditEmp() {
        return editEmp;
    }

    public void setEditEmp(String editEmp) {
        this.editEmp = editEmp;
    }

    public Date getCreaDate() {
        return creaDate;
    }

    public void setCreaDate(Date creaDate) {
        this.creaDate = creaDate;
    }

    public String getCreaEmp() {
        return creaEmp;
    }

    public void setCreaEmp(String creaEmp) {
        this.creaEmp = creaEmp;
    }

    public Collection<MtlKnd2Ang> getMtlKnd2AngCollection() {
        return mtlKnd2AngCollection;
    }

    public void setMtlKnd2AngCollection(Collection<MtlKnd2Ang> mtlKnd2AngCollection) {
        this.mtlKnd2AngCollection = mtlKnd2AngCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtlNo1 != null ? mtlNo1.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtlKnd1Ang)) {
            return false;
        }
        MtlKnd1Ang other = (MtlKnd1Ang) object;
        if ((this.mtlNo1 == null && other.mtlNo1 != null) || (this.mtlNo1 != null && !this.mtlNo1.equals(other.mtlNo1))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.MtlKnd1Ang[ mtlNo1=" + mtlNo1 + " ]";
    }
    
}
