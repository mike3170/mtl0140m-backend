/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stit.entity;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mike
 */
@Entity
@Table(name = "BAS_CST_MAST_D3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BasCstMastD3.findAll", query = "SELECT b FROM BasCstMastD3 b"),
    @NamedQuery(name = "BasCstMastD3.findByCstNo", query = "SELECT b FROM BasCstMastD3 b WHERE b.basCstMastD3PK.cstNo = :cstNo"),
    @NamedQuery(name = "BasCstMastD3.findByItemNo", query = "SELECT b FROM BasCstMastD3 b WHERE b.basCstMastD3PK.itemNo = :itemNo"),
    @NamedQuery(name = "BasCstMastD3.findByContactMan", query = "SELECT b FROM BasCstMastD3 b WHERE b.contactMan = :contactMan"),
    @NamedQuery(name = "BasCstMastD3.findByTelNo", query = "SELECT b FROM BasCstMastD3 b WHERE b.telNo = :telNo"),
    @NamedQuery(name = "BasCstMastD3.findByFaxNo", query = "SELECT b FROM BasCstMastD3 b WHERE b.faxNo = :faxNo"),
    @NamedQuery(name = "BasCstMastD3.findByDlvCstName", query = "SELECT b FROM BasCstMastD3 b WHERE b.dlvCstName = :dlvCstName"),
    @NamedQuery(name = "BasCstMastD3.findByDlvAddr", query = "SELECT b FROM BasCstMastD3 b WHERE b.dlvAddr = :dlvAddr"),
    @NamedQuery(name = "BasCstMastD3.findByDestination", query = "SELECT b FROM BasCstMastD3 b WHERE b.destination = :destination"),
    @NamedQuery(name = "BasCstMastD3.findByStopYn", query = "SELECT b FROM BasCstMastD3 b WHERE b.stopYn = :stopYn"),
    @NamedQuery(name = "BasCstMastD3.findByStopDate", query = "SELECT b FROM BasCstMastD3 b WHERE b.stopDate = :stopDate"),
    @NamedQuery(name = "BasCstMastD3.findByStopEmp", query = "SELECT b FROM BasCstMastD3 b WHERE b.stopEmp = :stopEmp"),
    @NamedQuery(name = "BasCstMastD3.findByEditDate", query = "SELECT b FROM BasCstMastD3 b WHERE b.editDate = :editDate"),
    @NamedQuery(name = "BasCstMastD3.findByEditEmp", query = "SELECT b FROM BasCstMastD3 b WHERE b.editEmp = :editEmp"),
    @NamedQuery(name = "BasCstMastD3.findByCreaDate", query = "SELECT b FROM BasCstMastD3 b WHERE b.creaDate = :creaDate"),
    @NamedQuery(name = "BasCstMastD3.findByCreaEmp", query = "SELECT b FROM BasCstMastD3 b WHERE b.creaEmp = :creaEmp"),
    @NamedQuery(name = "BasCstMastD3.findByDlvNo", query = "SELECT b FROM BasCstMastD3 b WHERE b.dlvNo = :dlvNo")})
public class BasCstMastD3 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BasCstMastD3PK basCstMastD3PK;
    @Column(name = "CONTACT_MAN")
    private String contactMan;
    @Column(name = "TEL_NO")
    private String telNo;
    @Column(name = "FAX_NO")
    private String faxNo;
    @Column(name = "DLV_CST_NAME")
    private String dlvCstName;
    @Basic(optional = false)
    @Column(name = "DLV_ADDR")
    private String dlvAddr;
    @Column(name = "DESTINATION")
    private String destination;
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
    @Column(name = "DLV_NO")
    private String dlvNo;
    @JoinColumn(name = "CST_NO", referencedColumnName = "CST_NO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BasCstMast basCstMast;

    public BasCstMastD3() {
    }

    public BasCstMastD3(BasCstMastD3PK basCstMastD3PK) {
        this.basCstMastD3PK = basCstMastD3PK;
    }

    public BasCstMastD3(BasCstMastD3PK basCstMastD3PK, String dlvAddr, String stopYn) {
        this.basCstMastD3PK = basCstMastD3PK;
        this.dlvAddr = dlvAddr;
        this.stopYn = stopYn;
    }

    public BasCstMastD3(String cstNo, short itemNo) {
        this.basCstMastD3PK = new BasCstMastD3PK(cstNo, itemNo);
    }

    public BasCstMastD3PK getBasCstMastD3PK() {
        return basCstMastD3PK;
    }

    public void setBasCstMastD3PK(BasCstMastD3PK basCstMastD3PK) {
        this.basCstMastD3PK = basCstMastD3PK;
    }

    public String getContactMan() {
        return contactMan;
    }

    public void setContactMan(String contactMan) {
        this.contactMan = contactMan;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    public String getDlvCstName() {
        return dlvCstName;
    }

    public void setDlvCstName(String dlvCstName) {
        this.dlvCstName = dlvCstName;
    }

    public String getDlvAddr() {
        return dlvAddr;
    }

    public void setDlvAddr(String dlvAddr) {
        this.dlvAddr = dlvAddr;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

    public String getDlvNo() {
        return dlvNo;
    }

    public void setDlvNo(String dlvNo) {
        this.dlvNo = dlvNo;
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
        hash += (basCstMastD3PK != null ? basCstMastD3PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BasCstMastD3)) {
            return false;
        }
        BasCstMastD3 other = (BasCstMastD3) object;
        if ((this.basCstMastD3PK == null && other.basCstMastD3PK != null) || (this.basCstMastD3PK != null && !this.basCstMastD3PK.equals(other.basCstMastD3PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.BasCstMastD3[ basCstMastD3PK=" + basCstMastD3PK + " ]";
    }
    
}
