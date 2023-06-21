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
@Table(name = "COD_KIND")
@NamedQueries({
    @NamedQuery(name = "CodKind.findAll", query = "SELECT c FROM CodKind c")})
public class CodKind implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KIND")
    private String kind;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "REMARKS")
    private String remarks;
    @Basic(optional = false)
    @Column(name = "USERCR")
    private String usercr;
    @Basic(optional = false)
    @Column(name = "LENG_LIMT")
    private short lengLimt;
    @Basic(optional = false)
    @Column(name = "BIG_KIND")
    private String bigKind;
    @Basic(optional = false)
    @Column(name = "MODULE")
    private String module;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codKind")
    private Collection<CodMast> codMastCollection;

    public CodKind() {
    }

    public CodKind(String kind) {
        this.kind = kind;
    }

    public CodKind(String kind, String name, String usercr, short lengLimt, String bigKind, String module) {
        this.kind = kind;
        this.name = name;
        this.usercr = usercr;
        this.lengLimt = lengLimt;
        this.bigKind = bigKind;
        this.module = module;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getUsercr() {
        return usercr;
    }

    public void setUsercr(String usercr) {
        this.usercr = usercr;
    }

    public short getLengLimt() {
        return lengLimt;
    }

    public void setLengLimt(short lengLimt) {
        this.lengLimt = lengLimt;
    }

    public String getBigKind() {
        return bigKind;
    }

    public void setBigKind(String bigKind) {
        this.bigKind = bigKind;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
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

    public Collection<CodMast> getCodMastCollection() {
        return codMastCollection;
    }

    public void setCodMastCollection(Collection<CodMast> codMastCollection) {
        this.codMastCollection = codMastCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kind != null ? kind.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CodKind)) {
            return false;
        }
        CodKind other = (CodKind) object;
        if ((this.kind == null && other.kind != null) || (this.kind != null && !this.kind.equals(other.kind))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.CodKind[ kind=" + kind + " ]";
    }
    
}
