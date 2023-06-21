/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
@Table(name = "MTL_PUR_ORDE_M_ANG")
@NamedQueries({
    @NamedQuery(name = "MtlPurOrdeMAng.findAll", query = "SELECT m FROM MtlPurOrdeMAng m")})
public class MtlPurOrdeMAng implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PO_NO")
    private String poNo;
    @Column(name = "PO_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date poDate;
    @Column(name = "VEN_NO")
    private String venNo;
    @Basic(optional = false)
    @Column(name = "PO_KIND")
    private String poKind;
    @Column(name = "CURR_NO")
    private String currNo;
    @Column(name = "PAYMENT_TERM")
    private String paymentTerm;
    @Column(name = "PAY_DAYS")
    private Short payDays;
    @Column(name = "PAY_KIND")
    private String payKind;
    @Column(name = "CAN_QTY_UP")
    private Short canQtyUp;
    @Column(name = "CAN_QTY_DN")
    private Short canQtyDn;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mtlPurOrdeMAng")
    private Collection<MtlPurOrdeDAng> mtlPurOrdeDAngCollection;

    public MtlPurOrdeMAng() {
    }

    public MtlPurOrdeMAng(String poNo) {
        this.poNo = poNo;
    }

    public MtlPurOrdeMAng(String poNo, String poKind) {
        this.poNo = poNo;
        this.poKind = poKind;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public Date getPoDate() {
        return poDate;
    }

    public void setPoDate(Date poDate) {
        this.poDate = poDate;
    }

    public String getVenNo() {
        return venNo;
    }

    public void setVenNo(String venNo) {
        this.venNo = venNo;
    }

    public String getPoKind() {
        return poKind;
    }

    public void setPoKind(String poKind) {
        this.poKind = poKind;
    }

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo;
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public Short getPayDays() {
        return payDays;
    }

    public void setPayDays(Short payDays) {
        this.payDays = payDays;
    }

    public String getPayKind() {
        return payKind;
    }

    public void setPayKind(String payKind) {
        this.payKind = payKind;
    }

    public Short getCanQtyUp() {
        return canQtyUp;
    }

    public void setCanQtyUp(Short canQtyUp) {
        this.canQtyUp = canQtyUp;
    }

    public Short getCanQtyDn() {
        return canQtyDn;
    }

    public void setCanQtyDn(Short canQtyDn) {
        this.canQtyDn = canQtyDn;
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

    public Collection<MtlPurOrdeDAng> getMtlPurOrdeDAngCollection() {
        return mtlPurOrdeDAngCollection;
    }

    public void setMtlPurOrdeDAngCollection(Collection<MtlPurOrdeDAng> mtlPurOrdeDAngCollection) {
        this.mtlPurOrdeDAngCollection = mtlPurOrdeDAngCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (poNo != null ? poNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtlPurOrdeMAng)) {
            return false;
        }
        MtlPurOrdeMAng other = (MtlPurOrdeMAng) object;
        if ((this.poNo == null && other.poNo != null) || (this.poNo != null && !this.poNo.equals(other.poNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.MtlPurOrdeMAng[ poNo=" + poNo + " ]";
    }
    
}
