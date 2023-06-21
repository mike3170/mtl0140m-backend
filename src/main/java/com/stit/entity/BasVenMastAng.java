/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "BAS_VEN_MAST_ANG")
@NamedQueries({
    @NamedQuery(name = "BasVenMastAng.findAll", query = "SELECT b FROM BasVenMastAng b")})
public class BasVenMastAng extends BaseEntity{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VEN_NO")
    private String venNo;
    @Basic(optional = false)
    @Column(name = "VEN_NAME")
    private String venName;
    @Column(name = "VEN_NAME_E")
    private String venNameE;
    @Basic(optional = false)
    @Column(name = "VEN_ABBR")
    private String venAbbr;
    @Column(name = "TAX_ID")
    private String taxId;
    @Column(name = "CST_NO")
    private String cstNo;
    @Column(name = "FIN_GROUP")
    private String finGroup;
    @Column(name = "RECEIVER")
    private String receiver;
    @Column(name = "PRICE_TERM")
    private String priceTerm;
    @Column(name = "PAYMENT_TERM")
    private String paymentTerm;
    @Column(name = "PAY_KIND")
    private String payKind;
    @Column(name = "PAY_DAYS")
    private Short payDays;
    @Basic(optional = false)
    @Column(name = "CURR_NO")
    private String currNo;
    @Basic(optional = false)
    @Column(name = "INV_KIND")
    private String invKind;
    @Basic(optional = false)
    @Column(name = "TAX_KIND")
    private String taxKind;
    @Basic(optional = false)
    @Column(name = "BILL_START")
    private short billStart;
    @Basic(optional = false)
    @Column(name = "BILL_END")
    private short billEnd;
    @Basic(optional = false)
    @Column(name = "FOREIGN")
    private String foreign;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "WIR_LOSS")
    private BigDecimal wirLoss;
    @Column(name = "LOW_PROC_AMT")
    private BigDecimal lowProcAmt;
    @Basic(optional = false)
    @Column(name = "STOP_YN")
    private String stopYn;
    @Column(name = "STOP_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stopDate;
    @Column(name = "STOP_EMP")
    private String stopEmp;
//    @Basic(optional = false)
    @Column(name = "BUY_DSCT")
    private BigDecimal buyDsct;
//    @Basic(optional = false)
    @Column(name = "DSCT_LIMT")
    private int dsctLimt;
//    @Basic(optional = false)
    @Column(name = "DSCT_RATE")
    private BigDecimal dsctRate;
    @Basic(optional = false)
    @Column(name = "LOSS_TYPE")
    private String lossType;
    @Basic(optional = false)
    @Column(name = "LOSS_RATE")
    private BigDecimal lossRate;
    @Column(name = "PAY_CHECK_CODE")
    private String payCheckCode;
    @Column(name = "WEB_SITE")
    private String webSite;
    @Column(name = "VEN_ADDR_1")
    private String venAddr1;
    @Column(name = "VEN_ADDR_2")
    private String venAddr2;
    @Column(name = "VEN_ADDR_3")
    private String venAddr3;
    @Column(name = "ZIP_CODE_1")
    private String zipCode1;
    @Column(name = "ZIP_CODE_2")
    private String zipCode2;
    @Column(name = "ZIP_CODE_3")
    private String zipCode3;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "MAKE_ABILITY")
    private String makeAbility;
    @Column(name = "QUALITY")
    private String quality;
    @Column(name = "CREA_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creaDate;
    @Column(name = "CREA_EMP")
    private String creaEmp;
    @Column(name = "EDIT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime editDate;
    @Column(name = "EDIT_EMP")
    private String editEmp;
    @Column(name = "BUILD_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date buildDate;
    @Column(name = "FIRST_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstDate;
    @Column(name = "WIRE_LOSS")
    private BigDecimal wireLoss;
    @Column(name = "VEN_ID")
    private String venId;
    @Column(name = "MCH_NO")
    private String mchNo;

    public BasVenMastAng() {
    }

    public BasVenMastAng(String venNo) {
        this.venNo = venNo;
    }

    public BasVenMastAng(String venNo, String venName, String venAbbr, String currNo, String invKind, String taxKind, short billStart, short billEnd, String foreign, String stopYn, BigDecimal buyDsct, int dsctLimt, BigDecimal dsctRate, String lossType, BigDecimal lossRate) {
        this.venNo = venNo;
        this.venName = venName;
        this.venAbbr = venAbbr;
        this.currNo = currNo;
        this.invKind = invKind;
        this.taxKind = taxKind;
        this.billStart = billStart;
        this.billEnd = billEnd;
        this.foreign = foreign;
        this.stopYn = stopYn;
        this.buyDsct = buyDsct;
        this.dsctLimt = dsctLimt;
        this.dsctRate = dsctRate;
        this.lossType = lossType;
        this.lossRate = lossRate;
    }

    public String getVenNo() {
        return venNo;
    }

    public void setVenNo(String venNo) {
        this.venNo = venNo;
    }

    public String getVenName() {
        return venName;
    }

    public void setVenName(String venName) {
        this.venName = venName;
    }

    public String getVenNameE() {
        return venNameE;
    }

    public void setVenNameE(String venNameE) {
        this.venNameE = venNameE;
    }

    public String getVenAbbr() {
        return venAbbr;
    }

    public void setVenAbbr(String venAbbr) {
        this.venAbbr = venAbbr;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getCstNo() {
        return cstNo;
    }

    public void setCstNo(String cstNo) {
        this.cstNo = cstNo;
    }

    public String getFinGroup() {
        return finGroup;
    }

    public void setFinGroup(String finGroup) {
        this.finGroup = finGroup;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPriceTerm() {
        return priceTerm;
    }

    public void setPriceTerm(String priceTerm) {
        this.priceTerm = priceTerm;
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public String getPayKind() {
        return payKind;
    }

    public void setPayKind(String payKind) {
        this.payKind = payKind;
    }

    public Short getPayDays() {
        return payDays;
    }

    public void setPayDays(Short payDays) {
        this.payDays = payDays;
    }

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo;
    }

    public String getInvKind() {
        return invKind;
    }

    public void setInvKind(String invKind) {
        this.invKind = invKind;
    }

    public String getTaxKind() {
        return taxKind;
    }

    public void setTaxKind(String taxKind) {
        this.taxKind = taxKind;
    }

    public short getBillStart() {
        return billStart;
    }

    public void setBillStart(short billStart) {
        this.billStart = billStart;
    }

    public short getBillEnd() {
        return billEnd;
    }

    public void setBillEnd(short billEnd) {
        this.billEnd = billEnd;
    }

    public String getForeign() {
        return foreign;
    }

    public void setForeign(String foreign) {
        this.foreign = foreign;
    }

    public BigDecimal getWirLoss() {
        return wirLoss;
    }

    public void setWirLoss(BigDecimal wirLoss) {
        this.wirLoss = wirLoss;
    }

    public BigDecimal getLowProcAmt() {
        return lowProcAmt;
    }

    public void setLowProcAmt(BigDecimal lowProcAmt) {
        this.lowProcAmt = lowProcAmt;
    }

    public String getStopYn() {
        return stopYn;
    }

    public void setStopYn(String stopYn) {
        this.stopYn = stopYn;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }

    public String getStopEmp() {
        return stopEmp;
    }

    public void setStopEmp(String stopEmp) {
        this.stopEmp = stopEmp;
    }

    public BigDecimal getBuyDsct() {
        return buyDsct;
    }

    public void setBuyDsct(BigDecimal buyDsct) {
        this.buyDsct = buyDsct;
    }

    public int getDsctLimt() {
        return dsctLimt;
    }

    public void setDsctLimt(int dsctLimt) {
        this.dsctLimt = dsctLimt;
    }

    public BigDecimal getDsctRate() {
        return dsctRate;
    }

    public void setDsctRate(BigDecimal dsctRate) {
        this.dsctRate = dsctRate;
    }

    public String getLossType() {
        return lossType;
    }

    public void setLossType(String lossType) {
        this.lossType = lossType;
    }

    public BigDecimal getLossRate() {
        return lossRate;
    }

    public void setLossRate(BigDecimal lossRate) {
        this.lossRate = lossRate;
    }

    public String getPayCheckCode() {
        return payCheckCode;
    }

    public void setPayCheckCode(String payCheckCode) {
        this.payCheckCode = payCheckCode;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getVenAddr1() {
        return venAddr1;
    }

    public void setVenAddr1(String venAddr1) {
        this.venAddr1 = venAddr1;
    }

    public String getVenAddr2() {
        return venAddr2;
    }

    public void setVenAddr2(String venAddr2) {
        this.venAddr2 = venAddr2;
    }

    public String getVenAddr3() {
        return venAddr3;
    }

    public void setVenAddr3(String venAddr3) {
        this.venAddr3 = venAddr3;
    }

    public String getZipCode1() {
        return zipCode1;
    }

    public void setZipCode1(String zipCode1) {
        this.zipCode1 = zipCode1;
    }

    public String getZipCode2() {
        return zipCode2;
    }

    public void setZipCode2(String zipCode2) {
        this.zipCode2 = zipCode2;
    }

    public String getZipCode3() {
        return zipCode3;
    }

    public void setZipCode3(String zipCode3) {
        this.zipCode3 = zipCode3;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getMakeAbility() {
        return makeAbility;
    }

    public void setMakeAbility(String makeAbility) {
        this.makeAbility = makeAbility;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

//    public Date getCreaDate() {
//        return creaDate;
//    }

    public void setCreaDate(LocalDateTime creaDate) {
        this.creaDate = creaDate;
    }

    public String getCreaEmp() {
        return creaEmp;
    }

    public void setCreaEmp(String creaEmp) {
        this.creaEmp = creaEmp;
    }

//    public Date getEditDate() {
//        return editDate;
//    }

    public void setEditDate(LocalDateTime editDate) {
        this.editDate = editDate;
    }

    public String getEditEmp() {
        return editEmp;
    }

    public void setEditEmp(String editEmp) {
        this.editEmp = editEmp;
    }

    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public Date getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public BigDecimal getWireLoss() {
        return wireLoss;
    }

    public void setWireLoss(BigDecimal wireLoss) {
        this.wireLoss = wireLoss;
    }

    public String getVenId() {
        return venId;
    }

    public void setVenId(String venId) {
        this.venId = venId;
    }

    public String getMchNo() {
        return mchNo;
    }

    public void setMchNo(String mchNo) {
        this.mchNo = mchNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (venNo != null ? venNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BasVenMastAng)) {
            return false;
        }
        BasVenMastAng other = (BasVenMastAng) object;
        if ((this.venNo == null && other.venNo != null) || (this.venNo != null && !this.venNo.equals(other.venNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.BasVenMastAng[ venNo=" + venNo + " ]";
    }
    
}
