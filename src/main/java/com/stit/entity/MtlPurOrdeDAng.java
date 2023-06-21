/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
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

/**
 *
 * @author mike
 */
@Entity
@Table(name = "MTL_PUR_ORDE_D_ANG")
@NamedQueries({
    @NamedQuery(name = "MtlPurOrdeDAng.findAll", query = "SELECT m FROM MtlPurOrdeDAng m")})
public class MtlPurOrdeDAng implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MtlPurOrdeDAngPK mtlPurOrdeDAngPK;
    @Basic(optional = false)
    @Column(name = "MTL_NO")
    private String mtlNo;
    @Column(name = "VER_NO")
    private Short verNo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PO_PRICE")
    private BigDecimal poPrice;
    @Column(name = "PO_QTY")
    private BigDecimal poQty;
    @Column(name = "PO_AMT")
    private BigDecimal poAmt;
    @Column(name = "PRE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date preDate;
    @Basic(optional = false)
    @Column(name = "STK_UNIT")
    private String stkUnit;
    @Basic(optional = false)
    @Column(name = "PUR_UNIT")
    private String purUnit;
    @Column(name = "IN_QTY")
    private BigDecimal inQty;
    @Column(name = "RETN_QTY")
    private BigDecimal retnQty;
    @Column(name = "CANL_QTY")
    private BigDecimal canlQty;
    @Column(name = "AUTO_YN")
    private String autoYn;
    @Column(name = "END_CODE")
    private String endCode;
    @Column(name = "END_REASON")
    private String endReason;
    @Column(name = "REMARK")
    private String remark;
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
    @JoinColumn(name = "PO_NO", referencedColumnName = "PO_NO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MtlPurOrdeMAng mtlPurOrdeMAng;

    public MtlPurOrdeDAng() {
    }

    public MtlPurOrdeDAng(MtlPurOrdeDAngPK mtlPurOrdeDAngPK) {
        this.mtlPurOrdeDAngPK = mtlPurOrdeDAngPK;
    }

    public MtlPurOrdeDAng(MtlPurOrdeDAngPK mtlPurOrdeDAngPK, String mtlNo, String stkUnit, String purUnit) {
        this.mtlPurOrdeDAngPK = mtlPurOrdeDAngPK;
        this.mtlNo = mtlNo;
        this.stkUnit = stkUnit;
        this.purUnit = purUnit;
    }

    public MtlPurOrdeDAng(String poNo, short itemNo) {
        this.mtlPurOrdeDAngPK = new MtlPurOrdeDAngPK(poNo, itemNo);
    }

    public MtlPurOrdeDAngPK getMtlPurOrdeDAngPK() {
        return mtlPurOrdeDAngPK;
    }

    public void setMtlPurOrdeDAngPK(MtlPurOrdeDAngPK mtlPurOrdeDAngPK) {
        this.mtlPurOrdeDAngPK = mtlPurOrdeDAngPK;
    }

    public String getMtlNo() {
        return mtlNo;
    }

    public void setMtlNo(String mtlNo) {
        this.mtlNo = mtlNo;
    }

    public Short getVerNo() {
        return verNo;
    }

    public void setVerNo(Short verNo) {
        this.verNo = verNo;
    }

    public BigDecimal getPoPrice() {
        return poPrice;
    }

    public void setPoPrice(BigDecimal poPrice) {
        this.poPrice = poPrice;
    }

    public BigDecimal getPoQty() {
        return poQty;
    }

    public void setPoQty(BigDecimal poQty) {
        this.poQty = poQty;
    }

    public BigDecimal getPoAmt() {
        return poAmt;
    }

    public void setPoAmt(BigDecimal poAmt) {
        this.poAmt = poAmt;
    }

    public Date getPreDate() {
        return preDate;
    }

    public void setPreDate(Date preDate) {
        this.preDate = preDate;
    }

    public String getStkUnit() {
        return stkUnit;
    }

    public void setStkUnit(String stkUnit) {
        this.stkUnit = stkUnit;
    }

    public String getPurUnit() {
        return purUnit;
    }

    public void setPurUnit(String purUnit) {
        this.purUnit = purUnit;
    }

    public BigDecimal getInQty() {
        return inQty;
    }

    public void setInQty(BigDecimal inQty) {
        this.inQty = inQty;
    }

    public BigDecimal getRetnQty() {
        return retnQty;
    }

    public void setRetnQty(BigDecimal retnQty) {
        this.retnQty = retnQty;
    }

    public BigDecimal getCanlQty() {
        return canlQty;
    }

    public void setCanlQty(BigDecimal canlQty) {
        this.canlQty = canlQty;
    }

    public String getAutoYn() {
        return autoYn;
    }

    public void setAutoYn(String autoYn) {
        this.autoYn = autoYn;
    }

    public String getEndCode() {
        return endCode;
    }

    public void setEndCode(String endCode) {
        this.endCode = endCode;
    }

    public String getEndReason() {
        return endReason;
    }

    public void setEndReason(String endReason) {
        this.endReason = endReason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public MtlPurOrdeMAng getMtlPurOrdeMAng() {
        return mtlPurOrdeMAng;
    }

    public void setMtlPurOrdeMAng(MtlPurOrdeMAng mtlPurOrdeMAng) {
        this.mtlPurOrdeMAng = mtlPurOrdeMAng;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtlPurOrdeDAngPK != null ? mtlPurOrdeDAngPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtlPurOrdeDAng)) {
            return false;
        }
        MtlPurOrdeDAng other = (MtlPurOrdeDAng) object;
        if ((this.mtlPurOrdeDAngPK == null && other.mtlPurOrdeDAngPK != null) || (this.mtlPurOrdeDAngPK != null && !this.mtlPurOrdeDAngPK.equals(other.mtlPurOrdeDAngPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.MtlPurOrdeDAng[ mtlPurOrdeDAngPK=" + mtlPurOrdeDAngPK + " ]";
    }
    
}
