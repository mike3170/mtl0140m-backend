/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mike
 */
@Entity
@Table(name = "BAS_CST_MAST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BasCstMast.findAll", query = "SELECT b FROM BasCstMast b"),
    @NamedQuery(name = "BasCstMast.findByCstNo", query = "SELECT b FROM BasCstMast b WHERE b.cstNo = :cstNo"),
    @NamedQuery(name = "BasCstMast.findByCstName", query = "SELECT b FROM BasCstMast b WHERE b.cstName = :cstName"),
    @NamedQuery(name = "BasCstMast.findByCstAbbr", query = "SELECT b FROM BasCstMast b WHERE b.cstAbbr = :cstAbbr"),
    @NamedQuery(name = "BasCstMast.findByCstType", query = "SELECT b FROM BasCstMast b WHERE b.cstType = :cstType"),
    @NamedQuery(name = "BasCstMast.findByLocaNo", query = "SELECT b FROM BasCstMast b WHERE b.locaNo = :locaNo"),
    @NamedQuery(name = "BasCstMast.findBySalesman", query = "SELECT b FROM BasCstMast b WHERE b.salesman = :salesman"),
    @NamedQuery(name = "BasCstMast.findByGrupNo", query = "SELECT b FROM BasCstMast b WHERE b.grupNo = :grupNo"),
    @NamedQuery(name = "BasCstMast.findByShipCompany", query = "SELECT b FROM BasCstMast b WHERE b.shipCompany = :shipCompany"),
    @NamedQuery(name = "BasCstMast.findByTriangleYn", query = "SELECT b FROM BasCstMast b WHERE b.triangleYn = :triangleYn"),
    @NamedQuery(name = "BasCstMast.findByDiscount", query = "SELECT b FROM BasCstMast b WHERE b.discount = :discount"),
    @NamedQuery(name = "BasCstMast.findByAdvDsct", query = "SELECT b FROM BasCstMast b WHERE b.advDsct = :advDsct"),
    @NamedQuery(name = "BasCstMast.findByCurrNo", query = "SELECT b FROM BasCstMast b WHERE b.currNo = :currNo"),
    @NamedQuery(name = "BasCstMast.findByDeliMethod", query = "SELECT b FROM BasCstMast b WHERE b.deliMethod = :deliMethod"),
    @NamedQuery(name = "BasCstMast.findByPriceTerm", query = "SELECT b FROM BasCstMast b WHERE b.priceTerm = :priceTerm"),
    @NamedQuery(name = "BasCstMast.findByPricePort", query = "SELECT b FROM BasCstMast b WHERE b.pricePort = :pricePort"),
    @NamedQuery(name = "BasCstMast.findByDestination", query = "SELECT b FROM BasCstMast b WHERE b.destination = :destination"),
    @NamedQuery(name = "BasCstMast.findByCustomBroker", query = "SELECT b FROM BasCstMast b WHERE b.customBroker = :customBroker"),
    @NamedQuery(name = "BasCstMast.findByPaymentTerm", query = "SELECT b FROM BasCstMast b WHERE b.paymentTerm = :paymentTerm"),
    @NamedQuery(name = "BasCstMast.findByPayKind", query = "SELECT b FROM BasCstMast b WHERE b.payKind = :payKind"),
    @NamedQuery(name = "BasCstMast.findByPayDays", query = "SELECT b FROM BasCstMast b WHERE b.payDays = :payDays"),
    @NamedQuery(name = "BasCstMast.findByTaxId", query = "SELECT b FROM BasCstMast b WHERE b.taxId = :taxId"),
    @NamedQuery(name = "BasCstMast.findByInvKind", query = "SELECT b FROM BasCstMast b WHERE b.invKind = :invKind"),
    @NamedQuery(name = "BasCstMast.findByTaxKind", query = "SELECT b FROM BasCstMast b WHERE b.taxKind = :taxKind"),
    @NamedQuery(name = "BasCstMast.findByCloseDd", query = "SELECT b FROM BasCstMast b WHERE b.closeDd = :closeDd"),
    @NamedQuery(name = "BasCstMast.findByTaxPriceYn", query = "SELECT b FROM BasCstMast b WHERE b.taxPriceYn = :taxPriceYn"),
    @NamedQuery(name = "BasCstMast.findByBankNo", query = "SELECT b FROM BasCstMast b WHERE b.bankNo = :bankNo"),
    @NamedQuery(name = "BasCstMast.findByAccoNo", query = "SELECT b FROM BasCstMast b WHERE b.accoNo = :accoNo"),
    @NamedQuery(name = "BasCstMast.findByBankRemark", query = "SELECT b FROM BasCstMast b WHERE b.bankRemark = :bankRemark"),
    @NamedQuery(name = "BasCstMast.findByStopYn", query = "SELECT b FROM BasCstMast b WHERE b.stopYn = :stopYn"),
    @NamedQuery(name = "BasCstMast.findByStopDate", query = "SELECT b FROM BasCstMast b WHERE b.stopDate = :stopDate"),
    @NamedQuery(name = "BasCstMast.findByStopEmp", query = "SELECT b FROM BasCstMast b WHERE b.stopEmp = :stopEmp"),
    @NamedQuery(name = "BasCstMast.findByEditDate", query = "SELECT b FROM BasCstMast b WHERE b.editDate = :editDate"),
    @NamedQuery(name = "BasCstMast.findByEditEmp", query = "SELECT b FROM BasCstMast b WHERE b.editEmp = :editEmp"),
    @NamedQuery(name = "BasCstMast.findByCreaDate", query = "SELECT b FROM BasCstMast b WHERE b.creaDate = :creaDate"),
    @NamedQuery(name = "BasCstMast.findByCreaEmp", query = "SELECT b FROM BasCstMast b WHERE b.creaEmp = :creaEmp"),
    @NamedQuery(name = "BasCstMast.findByWebSite", query = "SELECT b FROM BasCstMast b WHERE b.webSite = :webSite"),
    @NamedQuery(name = "BasCstMast.findByCstAddr1", query = "SELECT b FROM BasCstMast b WHERE b.cstAddr1 = :cstAddr1"),
    @NamedQuery(name = "BasCstMast.findByCstAddr2", query = "SELECT b FROM BasCstMast b WHERE b.cstAddr2 = :cstAddr2"),
    @NamedQuery(name = "BasCstMast.findByCstAddr3", query = "SELECT b FROM BasCstMast b WHERE b.cstAddr3 = :cstAddr3"),
    @NamedQuery(name = "BasCstMast.findByPacking", query = "SELECT b FROM BasCstMast b WHERE b.packing = :packing"),
    @NamedQuery(name = "BasCstMast.findByPayment", query = "SELECT b FROM BasCstMast b WHERE b.payment = :payment"),
    @NamedQuery(name = "BasCstMast.findByOrdRemarks", query = "SELECT b FROM BasCstMast b WHERE b.ordRemarks = :ordRemarks"),
    @NamedQuery(name = "BasCstMast.findByCstRemarks", query = "SELECT b FROM BasCstMast b WHERE b.cstRemarks = :cstRemarks"),
    @NamedQuery(name = "BasCstMast.findByShipMarkE", query = "SELECT b FROM BasCstMast b WHERE b.shipMarkE = :shipMarkE"),
    @NamedQuery(name = "BasCstMast.findByUpRate", query = "SELECT b FROM BasCstMast b WHERE b.upRate = :upRate"),
    @NamedQuery(name = "BasCstMast.findByDnRate", query = "SELECT b FROM BasCstMast b WHERE b.dnRate = :dnRate"),
    @NamedQuery(name = "BasCstMast.findByBankName", query = "SELECT b FROM BasCstMast b WHERE b.bankName = :bankName"),
    @NamedQuery(name = "BasCstMast.findByBankAddr", query = "SELECT b FROM BasCstMast b WHERE b.bankAddr = :bankAddr"),
    @NamedQuery(name = "BasCstMast.findBySwiftCode", query = "SELECT b FROM BasCstMast b WHERE b.swiftCode = :swiftCode"),
    @NamedQuery(name = "BasCstMast.findBySamplePlan", query = "SELECT b FROM BasCstMast b WHERE b.samplePlan = :samplePlan"),
    @NamedQuery(name = "BasCstMast.findByCategory", query = "SELECT b FROM BasCstMast b WHERE b.category = :category")})
public class BasCstMast implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CST_NO")
    private String cstNo;
    @Basic(optional = false)
    @Column(name = "CST_NAME")
    private String cstName;
    @Basic(optional = false)
    @Column(name = "CST_ABBR")
    private String cstAbbr;
    @Basic(optional = false)
    @Column(name = "CST_TYPE")
    private String cstType;
    @Column(name = "LOCA_NO")
    private String locaNo;
    @Column(name = "SALESMAN")
    private String salesman;
    @Column(name = "GRUP_NO")
    private String grupNo;
    @Column(name = "SHIP_COMPANY")
    private String shipCompany;
    @Basic(optional = false)
    @Column(name = "TRIANGLE_YN")
    private String triangleYn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DISCOUNT")
    private BigDecimal discount;
    @Column(name = "ADV_DSCT")
    private BigDecimal advDsct;
    @Column(name = "CURR_NO")
    private String currNo;
    @Column(name = "DELI_METHOD")
    private String deliMethod;
    @Column(name = "PRICE_TERM")
    private String priceTerm;
    @Column(name = "PRICE_PORT")
    private String pricePort;
    @Column(name = "DESTINATION")
    private String destination;
    @Column(name = "CUSTOM_BROKER")
    private String customBroker;
    @Column(name = "PAYMENT_TERM")
    private String paymentTerm;
    @Column(name = "PAY_KIND")
    private String payKind;
    @Column(name = "PAY_DAYS")
    private Short payDays;
    @Column(name = "TAX_ID")
    private String taxId;
    @Basic(optional = false)
    @Column(name = "INV_KIND")
    private String invKind;
    @Basic(optional = false)
    @Column(name = "TAX_KIND")
    private String taxKind;
    @Basic(optional = false)
    @Column(name = "CLOSE_DD")
    private short closeDd;
    @Basic(optional = false)
    @Column(name = "TAX_PRICE_YN")
    private String taxPriceYn;
    @Column(name = "BANK_NO")
    private String bankNo;
    @Column(name = "ACCO_NO")
    private String accoNo;
    @Column(name = "BANK_REMARK")
    private String bankRemark;
    @Basic(optional = false)
    @Column(name = "STOP_YN")
    private String stopYn;
    @Column(name = "STOP_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stopDate;
    @Column(name = "STOP_EMP")
    private String stopEmp;
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
    @Column(name = "WEB_SITE")
    private String webSite;
    @Column(name = "CST_ADDR_1")
    private String cstAddr1;
    @Column(name = "CST_ADDR_2")
    private String cstAddr2;
    @Column(name = "CST_ADDR_3")
    private String cstAddr3;
    @Column(name = "PACKING")
    private String packing;
    @Column(name = "PAYMENT")
    private String payment;
    @Column(name = "ORD_REMARKS")
    private String ordRemarks;
    @Column(name = "CST_REMARKS")
    private String cstRemarks;
    @Column(name = "SHIP_MARK_E")
    private String shipMarkE;
    @Column(name = "UP_RATE")
    private BigDecimal upRate;
    @Column(name = "DN_RATE")
    private BigDecimal dnRate;
    @Column(name = "BANK_NAME")
    private String bankName;
    @Column(name = "BANK_ADDR")
    private String bankAddr;
    @Column(name = "SWIFT_CODE")
    private String swiftCode;
    @Column(name = "SAMPLE_PLAN")
    private String samplePlan;
    @Column(name = "CATEGORY")
    private String category;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "basCstMast")
    private Collection<BasCstMastD> basCstMastDCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "basCstMast")
    private Collection<BasCstMastD3> basCstMastD3Collection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "basCstMast")
    private Collection<BasCstMastD1> basCstMastD1Collection;

    public BasCstMast() {
    }

    public BasCstMast(String cstNo) {
        this.cstNo = cstNo;
    }

    public BasCstMast(String cstNo, String cstName, String cstAbbr, String cstType, String triangleYn, String invKind, String taxKind, short closeDd, String taxPriceYn, String stopYn) {
        this.cstNo = cstNo;
        this.cstName = cstName;
        this.cstAbbr = cstAbbr;
        this.cstType = cstType;
        this.triangleYn = triangleYn;
        this.invKind = invKind;
        this.taxKind = taxKind;
        this.closeDd = closeDd;
        this.taxPriceYn = taxPriceYn;
        this.stopYn = stopYn;
    }

    public String getCstNo() {
        return cstNo;
    }

    public void setCstNo(String cstNo) {
        this.cstNo = cstNo;
    }

    public String getCstName() {
        return cstName;
    }

    public void setCstName(String cstName) {
        this.cstName = cstName;
    }

    public String getCstAbbr() {
        return cstAbbr;
    }

    public void setCstAbbr(String cstAbbr) {
        this.cstAbbr = cstAbbr;
    }

    public String getCstType() {
        return cstType;
    }

    public void setCstType(String cstType) {
        this.cstType = cstType;
    }

    public String getLocaNo() {
        return locaNo;
    }

    public void setLocaNo(String locaNo) {
        this.locaNo = locaNo;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getGrupNo() {
        return grupNo;
    }

    public void setGrupNo(String grupNo) {
        this.grupNo = grupNo;
    }

    public String getShipCompany() {
        return shipCompany;
    }

    public void setShipCompany(String shipCompany) {
        this.shipCompany = shipCompany;
    }

    public String getTriangleYn() {
        return triangleYn;
    }

    public void setTriangleYn(String triangleYn) {
        this.triangleYn = triangleYn;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getAdvDsct() {
        return advDsct;
    }

    public void setAdvDsct(BigDecimal advDsct) {
        this.advDsct = advDsct;
    }

    public String getCurrNo() {
        return currNo;
    }

    public void setCurrNo(String currNo) {
        this.currNo = currNo;
    }

    public String getDeliMethod() {
        return deliMethod;
    }

    public void setDeliMethod(String deliMethod) {
        this.deliMethod = deliMethod;
    }

    public String getPriceTerm() {
        return priceTerm;
    }

    public void setPriceTerm(String priceTerm) {
        this.priceTerm = priceTerm;
    }

    public String getPricePort() {
        return pricePort;
    }

    public void setPricePort(String pricePort) {
        this.pricePort = pricePort;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCustomBroker() {
        return customBroker;
    }

    public void setCustomBroker(String customBroker) {
        this.customBroker = customBroker;
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

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
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

    public short getCloseDd() {
        return closeDd;
    }

    public void setCloseDd(short closeDd) {
        this.closeDd = closeDd;
    }

    public String getTaxPriceYn() {
        return taxPriceYn;
    }

    public void setTaxPriceYn(String taxPriceYn) {
        this.taxPriceYn = taxPriceYn;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getAccoNo() {
        return accoNo;
    }

    public void setAccoNo(String accoNo) {
        this.accoNo = accoNo;
    }

    public String getBankRemark() {
        return bankRemark;
    }

    public void setBankRemark(String bankRemark) {
        this.bankRemark = bankRemark;
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

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getCstAddr1() {
        return cstAddr1;
    }

    public void setCstAddr1(String cstAddr1) {
        this.cstAddr1 = cstAddr1;
    }

    public String getCstAddr2() {
        return cstAddr2;
    }

    public void setCstAddr2(String cstAddr2) {
        this.cstAddr2 = cstAddr2;
    }

    public String getCstAddr3() {
        return cstAddr3;
    }

    public void setCstAddr3(String cstAddr3) {
        this.cstAddr3 = cstAddr3;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getOrdRemarks() {
        return ordRemarks;
    }

    public void setOrdRemarks(String ordRemarks) {
        this.ordRemarks = ordRemarks;
    }

    public String getCstRemarks() {
        return cstRemarks;
    }

    public void setCstRemarks(String cstRemarks) {
        this.cstRemarks = cstRemarks;
    }

    public String getShipMarkE() {
        return shipMarkE;
    }

    public void setShipMarkE(String shipMarkE) {
        this.shipMarkE = shipMarkE;
    }

    public BigDecimal getUpRate() {
        return upRate;
    }

    public void setUpRate(BigDecimal upRate) {
        this.upRate = upRate;
    }

    public BigDecimal getDnRate() {
        return dnRate;
    }

    public void setDnRate(BigDecimal dnRate) {
        this.dnRate = dnRate;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddr() {
        return bankAddr;
    }

    public void setBankAddr(String bankAddr) {
        this.bankAddr = bankAddr;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public String getSamplePlan() {
        return samplePlan;
    }

    public void setSamplePlan(String samplePlan) {
        this.samplePlan = samplePlan;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @XmlTransient
    public Collection<BasCstMastD> getBasCstMastDCollection() {
        return basCstMastDCollection;
    }

    public void setBasCstMastDCollection(Collection<BasCstMastD> basCstMastDCollection) {
        this.basCstMastDCollection = basCstMastDCollection;
    }

    @XmlTransient
    public Collection<BasCstMastD3> getBasCstMastD3Collection() {
        return basCstMastD3Collection;
    }

    public void setBasCstMastD3Collection(Collection<BasCstMastD3> basCstMastD3Collection) {
        this.basCstMastD3Collection = basCstMastD3Collection;
    }

    @XmlTransient
    public Collection<BasCstMastD1> getBasCstMastD1Collection() {
        return basCstMastD1Collection;
    }

    public void setBasCstMastD1Collection(Collection<BasCstMastD1> basCstMastD1Collection) {
        this.basCstMastD1Collection = basCstMastD1Collection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cstNo != null ? cstNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BasCstMast)) {
            return false;
        }
        BasCstMast other = (BasCstMast) object;
        if ((this.cstNo == null && other.cstNo != null) || (this.cstNo != null && !this.cstNo.equals(other.cstNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.BasCstMast[ cstNo=" + cstNo + " ]";
    }
    
}
