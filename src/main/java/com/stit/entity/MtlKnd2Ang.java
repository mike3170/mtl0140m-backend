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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mike
 */
@Entity
@Table(name = "MTL_KND2_ANG")
@NamedQueries({
    @NamedQuery(name = "MtlKnd2Ang.findAll", query = "SELECT m FROM MtlKnd2Ang m"),
    @NamedQuery(name = "MtlKnd2Ang.findByMtlNo1", query = "SELECT m FROM MtlKnd2Ang m WHERE m.mtlKnd2AngPK.mtlNo1 = :mtlNo1"),
    @NamedQuery(name = "MtlKnd2Ang.findByMtlNo2", query = "SELECT m FROM MtlKnd2Ang m WHERE m.mtlKnd2AngPK.mtlNo2 = :mtlNo2"),
    @NamedQuery(name = "MtlKnd2Ang.findByKnd2Name", query = "SELECT m FROM MtlKnd2Ang m WHERE m.knd2Name = :knd2Name"),
    @NamedQuery(name = "MtlKnd2Ang.findByAccNo", query = "SELECT m FROM MtlKnd2Ang m WHERE m.accNo = :accNo"),
    @NamedQuery(name = "MtlKnd2Ang.findByStkYn", query = "SELECT m FROM MtlKnd2Ang m WHERE m.stkYn = :stkYn"),
    @NamedQuery(name = "MtlKnd2Ang.findByRmtlYn", query = "SELECT m FROM MtlKnd2Ang m WHERE m.rmtlYn = :rmtlYn"),
    @NamedQuery(name = "MtlKnd2Ang.findByDmtlYn", query = "SELECT m FROM MtlKnd2Ang m WHERE m.dmtlYn = :dmtlYn"),
    @NamedQuery(name = "MtlKnd2Ang.findByEditDate", query = "SELECT m FROM MtlKnd2Ang m WHERE m.editDate = :editDate"),
    @NamedQuery(name = "MtlKnd2Ang.findByEditEmp", query = "SELECT m FROM MtlKnd2Ang m WHERE m.editEmp = :editEmp"),
    @NamedQuery(name = "MtlKnd2Ang.findByCreaDate", query = "SELECT m FROM MtlKnd2Ang m WHERE m.creaDate = :creaDate"),
    @NamedQuery(name = "MtlKnd2Ang.findByCreaEmp", query = "SELECT m FROM MtlKnd2Ang m WHERE m.creaEmp = :creaEmp")})
public class MtlKnd2Ang implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MtlKnd2AngPK mtlKnd2AngPK;
    @Column(name = "KND2_NAME")
    private String knd2Name;
    @Column(name = "ACC_NO")
    private String accNo;
    @Basic(optional = false)
    @Column(name = "STK_YN")
    private String stkYn;
    @Basic(optional = false)
    @Column(name = "RMTL_YN")
    private String rmtlYn;
    @Basic(optional = false)
    @Column(name = "DMTL_YN")
    private String dmtlYn;
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
    @JoinColumn(name = "MTL_NO1", referencedColumnName = "MTL_NO1", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MtlKnd1Ang mtlKnd1Ang;

    public MtlKnd2Ang() {
    }

    public MtlKnd2Ang(MtlKnd2AngPK mtlKnd2AngPK) {
        this.mtlKnd2AngPK = mtlKnd2AngPK;
    }

    public MtlKnd2Ang(MtlKnd2AngPK mtlKnd2AngPK, String stkYn, String rmtlYn, String dmtlYn) {
        this.mtlKnd2AngPK = mtlKnd2AngPK;
        this.stkYn = stkYn;
        this.rmtlYn = rmtlYn;
        this.dmtlYn = dmtlYn;
    }

    public MtlKnd2Ang(String mtlNo1, String mtlNo2) {
        this.mtlKnd2AngPK = new MtlKnd2AngPK(mtlNo1, mtlNo2);
    }

    public MtlKnd2AngPK getMtlKnd2AngPK() {
        return mtlKnd2AngPK;
    }

    public void setMtlKnd2AngPK(MtlKnd2AngPK mtlKnd2AngPK) {
        this.mtlKnd2AngPK = mtlKnd2AngPK;
    }

    public String getKnd2Name() {
        return knd2Name;
    }

    public void setKnd2Name(String knd2Name) {
        this.knd2Name = knd2Name;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getStkYn() {
        return stkYn;
    }

    public void setStkYn(String stkYn) {
        this.stkYn = stkYn;
    }

    public String getRmtlYn() {
        return rmtlYn;
    }

    public void setRmtlYn(String rmtlYn) {
        this.rmtlYn = rmtlYn;
    }

    public String getDmtlYn() {
        return dmtlYn;
    }

    public void setDmtlYn(String dmtlYn) {
        this.dmtlYn = dmtlYn;
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

    public MtlKnd1Ang getMtlKnd1Ang() {
        return mtlKnd1Ang;
    }

    public void setMtlKnd1Ang(MtlKnd1Ang mtlKnd1Ang) {
        this.mtlKnd1Ang = mtlKnd1Ang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtlKnd2AngPK != null ? mtlKnd2AngPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtlKnd2Ang)) {
            return false;
        }
        MtlKnd2Ang other = (MtlKnd2Ang) object;
        if ((this.mtlKnd2AngPK == null && other.mtlKnd2AngPK != null) || (this.mtlKnd2AngPK != null && !this.mtlKnd2AngPK.equals(other.mtlKnd2AngPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.MtlKnd2Ang[ mtlKnd2AngPK=" + mtlKnd2AngPK + " ]";
    }
    
}
