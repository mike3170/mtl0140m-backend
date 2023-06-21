/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
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
@Table(name = "MTL_MAST_ANG")
@NamedQueries({
    @NamedQuery(name = "MtlMastAng.findAll", query = "SELECT m FROM MtlMastAng m")})
public class MtlMastAng implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "MTL_NO1")
    private String mtlNo1;
    @Column(name = "MTL_NO2")
    private String mtlNo2;
    @Basic(optional = false)
    @Column(name = "MTL_NO3")
    private String mtlNo3;
    @Id
    @Basic(optional = false)
    @Column(name = "MTL_NO")
    private String mtlNo;
    @Column(name = "MTL_NAME")
    private String mtlName;
    @Basic(optional = false)
    @Column(name = "MTL_SPEC")
    private String mtlSpec;
    @Basic(optional = false)
    @Column(name = "MTL_GRADE")
    private String mtlGrade;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "STK_YN")
    private String stkYn;
    @Column(name = "PUR_UNIT")
    private String purUnit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TRAN_RATE")
    private BigDecimal tranRate;
    @Column(name = "STK_UNIT")
    private String stkUnit;
    @Column(name = "CTRL_UOM_YN")
    private String ctrlUomYn;
    @Column(name = "LEAST_BUY")
    private BigDecimal leastBuy;
    @Column(name = "SAVE_QTY")
    private BigDecimal saveQty;
    @Column(name = "LEAD_TIME")
    private BigDecimal leadTime;
    @Column(name = "IN_ALLOW")
    private BigDecimal inAllow;
    @Column(name = "USE_UNIT")
    private String useUnit;
    @Column(name = "PCS_PER_KG")
    private BigDecimal pcsPerKg;
    @Column(name = "STOP_YN")
    private String stopYn;
    
    @Column(name = "STOP_DATE")    
//    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate stopDate;
    
    @Column(name = "STOP_EMP")    
    private String stopEmp;
    @Column(name = "FIRST_IN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstInDate;
    @Column(name = "LAST_IN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastInDate;
    @Column(name = "LAST_ISSU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastIssuDate;
    @Column(name = "PICT_NO")
    private String pictNo;
    @Column(name = "ACC_NO")
    private String accNo;
    @Column(name = "MATERIAL")
    private String material;
    @Column(name = "REQ_CYCLE")
    private BigDecimal reqCycle;
    @Column(name = "STD_USED_QTY")
    private BigDecimal stdUsedQty;
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
    @Column(name = "REMARK")
    private String remark;
    @Column(name = "OLD_MCH_TYPE")
    private String oldMchType;

    public MtlMastAng() {
    }

    public MtlMastAng(String mtlNo) {
        this.mtlNo = mtlNo;
    }

    public MtlMastAng(String mtlNo, String mtlNo3, String mtlSpec, String mtlGrade) {
        this.mtlNo = mtlNo;
        this.mtlNo3 = mtlNo3;
        this.mtlSpec = mtlSpec;
        this.mtlGrade = mtlGrade;
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

    public String getMtlNo3() {
        return mtlNo3;
    }

    public void setMtlNo3(String mtlNo3) {
        this.mtlNo3 = mtlNo3;
    }

    public String getMtlNo() {
        return mtlNo;
    }

    public void setMtlNo(String mtlNo) {
        this.mtlNo = mtlNo;
    }

    public String getMtlName() {
        return mtlName;
    }

    public void setMtlName(String mtlName) {
        this.mtlName = mtlName;
    }

    public String getMtlSpec() {
        return mtlSpec;
    }

    public void setMtlSpec(String mtlSpec) {
        this.mtlSpec = mtlSpec;
    }

    public String getMtlGrade() {
        return mtlGrade;
    }

    public void setMtlGrade(String mtlGrade) {
        this.mtlGrade = mtlGrade;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStkYn() {
        return stkYn;
    }

    public void setStkYn(String stkYn) {
        this.stkYn = stkYn;
    }

    public String getPurUnit() {
        return purUnit;
    }

    public void setPurUnit(String purUnit) {
        this.purUnit = purUnit;
    }

    public BigDecimal getTranRate() {
        return tranRate;
    }

    public void setTranRate(BigDecimal tranRate) {
        this.tranRate = tranRate;
    }

    public String getStkUnit() {
        return stkUnit;
    }

    public void setStkUnit(String stkUnit) {
        this.stkUnit = stkUnit;
    }

    public String getCtrlUomYn() {
        return ctrlUomYn;
    }

    public void setCtrlUomYn(String ctrlUomYn) {
        this.ctrlUomYn = ctrlUomYn;
    }

    public BigDecimal getLeastBuy() {
        return leastBuy;
    }

    public void setLeastBuy(BigDecimal leastBuy) {
        this.leastBuy = leastBuy;
    }

    public BigDecimal getSaveQty() {
        return saveQty;
    }

    public void setSaveQty(BigDecimal saveQty) {
        this.saveQty = saveQty;
    }

    public BigDecimal getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(BigDecimal leadTime) {
        this.leadTime = leadTime;
    }

    public BigDecimal getInAllow() {
        return inAllow;
    }

    public void setInAllow(BigDecimal inAllow) {
        this.inAllow = inAllow;
    }

    public String getUseUnit() {
        return useUnit;
    }

    public void setUseUnit(String useUnit) {
        this.useUnit = useUnit;
    }

    public BigDecimal getPcsPerKg() {
        return pcsPerKg;
    }

    public void setPcsPerKg(BigDecimal pcsPerKg) {
        this.pcsPerKg = pcsPerKg;
    }

    public String getStopYn() {
        return stopYn;
    }

    public void setStopYn(String stopYn) {
        this.stopYn = stopYn;
    }

    public LocalDate getStopDate() {
        return stopDate;
    }

    public void setStopDate(LocalDate stopDate) {
        this.stopDate = stopDate;
    }

    public String getStopEmp() {
        return stopEmp;
    }

    public void setStopEmp(String stopEmp) {
        this.stopEmp = stopEmp;
    }

    public Date getFirstInDate() {
        return firstInDate;
    }

    public void setFirstInDate(Date firstInDate) {
        this.firstInDate = firstInDate;
    }

    public Date getLastInDate() {
        return lastInDate;
    }

    public void setLastInDate(Date lastInDate) {
        this.lastInDate = lastInDate;
    }

    public Date getLastIssuDate() {
        return lastIssuDate;
    }

    public void setLastIssuDate(Date lastIssuDate) {
        this.lastIssuDate = lastIssuDate;
    }

    public String getPictNo() {
        return pictNo;
    }

    public void setPictNo(String pictNo) {
        this.pictNo = pictNo;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public BigDecimal getReqCycle() {
        return reqCycle;
    }

    public void setReqCycle(BigDecimal reqCycle) {
        this.reqCycle = reqCycle;
    }

    public BigDecimal getStdUsedQty() {
        return stdUsedQty;
    }

    public void setStdUsedQty(BigDecimal stdUsedQty) {
        this.stdUsedQty = stdUsedQty;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOldMchType() {
        return oldMchType;
    }

    public void setOldMchType(String oldMchType) {
        this.oldMchType = oldMchType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtlNo != null ? mtlNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtlMastAng)) {
            return false;
        }
        MtlMastAng other = (MtlMastAng) object;
        if ((this.mtlNo == null && other.mtlNo != null) || (this.mtlNo != null && !this.mtlNo.equals(other.mtlNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.MtlMastAng[ mtlNo=" + mtlNo + " ]";
    }
    
}
