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
@Table(name = "BAS_CST_MAST_D")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BasCstMastD.findAll", query = "SELECT b FROM BasCstMastD b"),
    @NamedQuery(name = "BasCstMastD.findByCstNo", query = "SELECT b FROM BasCstMastD b WHERE b.basCstMastDPK.cstNo = :cstNo"),
    @NamedQuery(name = "BasCstMastD.findBySeqNo", query = "SELECT b FROM BasCstMastD b WHERE b.basCstMastDPK.seqNo = :seqNo"),
    @NamedQuery(name = "BasCstMastD.findByContactMan", query = "SELECT b FROM BasCstMastD b WHERE b.contactMan = :contactMan"),
    @NamedQuery(name = "BasCstMastD.findByTitle", query = "SELECT b FROM BasCstMastD b WHERE b.title = :title"),
    @NamedQuery(name = "BasCstMastD.findByTelNo", query = "SELECT b FROM BasCstMastD b WHERE b.telNo = :telNo"),
    @NamedQuery(name = "BasCstMastD.findByExtension", query = "SELECT b FROM BasCstMastD b WHERE b.extension = :extension"),
    @NamedQuery(name = "BasCstMastD.findByCellPhone", query = "SELECT b FROM BasCstMastD b WHERE b.cellPhone = :cellPhone"),
    @NamedQuery(name = "BasCstMastD.findByFaxNo", query = "SELECT b FROM BasCstMastD b WHERE b.faxNo = :faxNo"),
    @NamedQuery(name = "BasCstMastD.findByEditDate", query = "SELECT b FROM BasCstMastD b WHERE b.editDate = :editDate"),
    @NamedQuery(name = "BasCstMastD.findByEditEmp", query = "SELECT b FROM BasCstMastD b WHERE b.editEmp = :editEmp"),
    @NamedQuery(name = "BasCstMastD.findByCreaDate", query = "SELECT b FROM BasCstMastD b WHERE b.creaDate = :creaDate"),
    @NamedQuery(name = "BasCstMastD.findByCreaEmp", query = "SELECT b FROM BasCstMastD b WHERE b.creaEmp = :creaEmp"),
    @NamedQuery(name = "BasCstMastD.findByEMail", query = "SELECT b FROM BasCstMastD b WHERE b.eMail = :eMail"),
    @NamedQuery(name = "BasCstMastD.findByAddress", query = "SELECT b FROM BasCstMastD b WHERE b.address = :address"),
    @NamedQuery(name = "BasCstMastD.findByRemarks", query = "SELECT b FROM BasCstMastD b WHERE b.remarks = :remarks"),
    @NamedQuery(name = "BasCstMastD.findByCallNo", query = "SELECT b FROM BasCstMastD b WHERE b.callNo = :callNo"),
    @NamedQuery(name = "BasCstMastD.findByTelNo2", query = "SELECT b FROM BasCstMastD b WHERE b.telNo2 = :telNo2")})
public class BasCstMastD implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BasCstMastDPK basCstMastDPK;
    @Column(name = "CONTACT_MAN")
    private String contactMan;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "TEL_NO")
    private String telNo;
    @Column(name = "EXTENSION")
    private String extension;
    @Column(name = "CELL_PHONE")
    private String cellPhone;
    @Column(name = "FAX_NO")
    private String faxNo;
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
    @Column(name = "E_MAIL")
    private String eMail;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "CALL_NO")
    private String callNo;
    @Column(name = "TEL_NO2")
    private String telNo2;
    @JoinColumn(name = "CST_NO", referencedColumnName = "CST_NO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BasCstMast basCstMast;

    public BasCstMastD() {
    }

    public BasCstMastD(BasCstMastDPK basCstMastDPK) {
        this.basCstMastDPK = basCstMastDPK;
    }

    public BasCstMastD(String cstNo, short seqNo) {
        this.basCstMastDPK = new BasCstMastDPK(cstNo, seqNo);
    }

    public BasCstMastDPK getBasCstMastDPK() {
        return basCstMastDPK;
    }

    public void setBasCstMastDPK(BasCstMastDPK basCstMastDPK) {
        this.basCstMastDPK = basCstMastDPK;
    }

    public String getContactMan() {
        return contactMan;
    }

    public void setContactMan(String contactMan) {
        this.contactMan = contactMan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
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

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCallNo() {
        return callNo;
    }

    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    public String getTelNo2() {
        return telNo2;
    }

    public void setTelNo2(String telNo2) {
        this.telNo2 = telNo2;
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
        hash += (basCstMastDPK != null ? basCstMastDPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BasCstMastD)) {
            return false;
        }
        BasCstMastD other = (BasCstMastD) object;
        if ((this.basCstMastDPK == null && other.basCstMastDPK != null) || (this.basCstMastDPK != null && !this.basCstMastDPK.equals(other.basCstMastDPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.BasCstMastD[ basCstMastDPK=" + basCstMastDPK + " ]";
    }
    
}
