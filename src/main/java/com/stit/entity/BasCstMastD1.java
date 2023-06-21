/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stit.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mike
 */
@Entity
@Table(name = "BAS_CST_MAST_D1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BasCstMastD1.findAll", query = "SELECT b FROM BasCstMastD1 b"),
    @NamedQuery(name = "BasCstMastD1.findByCstNo", query = "SELECT b FROM BasCstMastD1 b WHERE b.basCstMastD1PK.cstNo = :cstNo"),
    @NamedQuery(name = "BasCstMastD1.findBySeqNo", query = "SELECT b FROM BasCstMastD1 b WHERE b.basCstMastD1PK.seqNo = :seqNo"),
    @NamedQuery(name = "BasCstMastD1.findByPackingE", query = "SELECT b FROM BasCstMastD1 b WHERE b.packingE = :packingE"),
    @NamedQuery(name = "BasCstMastD1.findByPackingC", query = "SELECT b FROM BasCstMastD1 b WHERE b.packingC = :packingC"),
    @NamedQuery(name = "BasCstMastD1.findByEditDate", query = "SELECT b FROM BasCstMastD1 b WHERE b.editDate = :editDate"),
    @NamedQuery(name = "BasCstMastD1.findByEditEmp", query = "SELECT b FROM BasCstMastD1 b WHERE b.editEmp = :editEmp"),
    @NamedQuery(name = "BasCstMastD1.findByCreaDate", query = "SELECT b FROM BasCstMastD1 b WHERE b.creaDate = :creaDate"),
    @NamedQuery(name = "BasCstMastD1.findByCreaEmp", query = "SELECT b FROM BasCstMastD1 b WHERE b.creaEmp = :creaEmp")})
public class BasCstMastD1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BasCstMastD1PK basCstMastD1PK;
    @Column(name = "PACKING_E")
    private String packingE;
    @Column(name = "PACKING_C")
    private String packingC;
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
    @JoinColumn(name = "CST_NO", referencedColumnName = "CST_NO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BasCstMast basCstMast;

    public BasCstMastD1() {
    }

    public BasCstMastD1(BasCstMastD1PK basCstMastD1PK) {
        this.basCstMastD1PK = basCstMastD1PK;
    }

    public BasCstMastD1(String cstNo, short seqNo) {
        this.basCstMastD1PK = new BasCstMastD1PK(cstNo, seqNo);
    }

    public BasCstMastD1PK getBasCstMastD1PK() {
        return basCstMastD1PK;
    }

    public void setBasCstMastD1PK(BasCstMastD1PK basCstMastD1PK) {
        this.basCstMastD1PK = basCstMastD1PK;
    }

    public String getPackingE() {
        return packingE;
    }

    public void setPackingE(String packingE) {
        this.packingE = packingE;
    }

    public String getPackingC() {
        return packingC;
    }

    public void setPackingC(String packingC) {
        this.packingC = packingC;
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

    public BasCstMast getBasCstMast() {
        return basCstMast;
    }

    public void setBasCstMast(BasCstMast basCstMast) {
        this.basCstMast = basCstMast;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (basCstMastD1PK != null ? basCstMastD1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BasCstMastD1)) {
            return false;
        }
        BasCstMastD1 other = (BasCstMastD1) object;
        if ((this.basCstMastD1PK == null && other.basCstMastD1PK != null) || (this.basCstMastD1PK != null && !this.basCstMastD1PK.equals(other.basCstMastD1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.BasCstMastD1[ basCstMastD1PK=" + basCstMastD1PK + " ]";
    }
    
}
