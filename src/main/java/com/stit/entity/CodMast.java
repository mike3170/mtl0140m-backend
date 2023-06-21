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
@Table(name = "COD_MAST")
@NamedQueries({
    @NamedQuery(name = "CodMast.findAll", query = "SELECT c FROM CodMast c")})
public class CodMast implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CodMastPK codMastPK;
    @Basic(optional = false)
    @Column(name = "CODE_NAME")
    private String codeName;
    @Column(name = "CODE_NAME_E")
    private String codeNameE;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTY")
    private BigDecimal qty;
    @Column(name = "QTY_1")
    private BigDecimal qty1;
    @Column(name = "QTY_2")
    private BigDecimal qty2;
    @Column(name = "TEXT")
    private String text;
    @Column(name = "TEXT_1")
    private String text1;
    @Column(name = "TEXT_2")
    private String text2;
    @Column(name = "REMARKS")
    private String remarks;
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
    @Column(name = "QTY_3")
    private BigDecimal qty3;
    @Column(name = "TEXT_3")
    private String text3;
    @Column(name = "QTY_4")
    private BigDecimal qty4;
    @Column(name = "TEXT_4")
    private String text4;
    
    @JoinColumn(name = "KIND", referencedColumnName = "KIND", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CodKind codKind;

    public CodMast() {
    }

    public CodMast(CodMastPK codMastPK) {
        this.codMastPK = codMastPK;
    }

    public CodMast(CodMastPK codMastPK, String codeName, String stopYn) {
        this.codMastPK = codMastPK;
        this.codeName = codeName;
        this.stopYn = stopYn;
    }

    public CodMast(String kind, String codeNo) {
        this.codMastPK = new CodMastPK(kind, codeNo);
    }

    public CodMastPK getCodMastPK() {
        return codMastPK;
    }

    public void setCodMastPK(CodMastPK codMastPK) {
        this.codMastPK = codMastPK;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getCodeNameE() {
        return codeNameE;
    }

    public void setCodeNameE(String codeNameE) {
        this.codeNameE = codeNameE;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getQty1() {
        return qty1;
    }

    public void setQty1(BigDecimal qty1) {
        this.qty1 = qty1;
    }

    public BigDecimal getQty2() {
        return qty2;
    }

    public void setQty2(BigDecimal qty2) {
        this.qty2 = qty2;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public BigDecimal getQty3() {
        return qty3;
    }

    public void setQty3(BigDecimal qty3) {
        this.qty3 = qty3;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public BigDecimal getQty4() {
        return qty4;
    }

    public void setQty4(BigDecimal qty4) {
        this.qty4 = qty4;
    }

    public String getText4() {
        return text4;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }

    public CodKind getCodKind() {
        return codKind;
    }

    public void setCodKind(CodKind codKind) {
        this.codKind = codKind;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMastPK != null ? codMastPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CodMast)) {
            return false;
        }
        CodMast other = (CodMast) object;
        if ((this.codMastPK == null && other.codMastPK != null) || (this.codMastPK != null && !this.codMastPK.equals(other.codMastPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.CodMast[ codMastPK=" + codMastPK + " ]";
    }
    
}
