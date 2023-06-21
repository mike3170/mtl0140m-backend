/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stit.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Column(name = "EDIT_DATE")
    @LastModifiedDate
    private LocalDateTime editDate;

    @Column(name = "EDIT_EMP")
    @LastModifiedBy
    private String editEmp;

    @Column(name = "CREA_DATE", updatable = false)
    @CreatedDate
    private LocalDateTime creaDate;

    @Column(name = "CREA_EMP", updatable = false)
    @CreatedBy
    private String creaEmp;

    /**
     * @return the editDate
     */
    public LocalDateTime getEditDate() {
        return editDate;
    }

    /**
     * @param editDate the editDate to set
     */
    public void setEditDate(LocalDateTime editDate) {
        this.editDate = editDate;
    }

    /**
     * @return the editEmp
     */
    public String getEditEmp() {
        return editEmp;
    }

    /**
     * @param editEmp the editEmp to set
     */
    public void setEditEmp(String editEmp) {
        this.editEmp = editEmp;
    }

    /**
     * @return the creaDate
     */
    public LocalDateTime getCreaDate() {
        return creaDate;
    }

    /**
     * @param creaDate the creaDate to set
     */
    public void setCreaDate(LocalDateTime creaDate) {
        this.creaDate = creaDate;
    }

    /**
     * @return the creaEmp
     */
    public String getCreaEmp() {
        return creaEmp;
    }

    /**
     * @param creaEmp the creaEmp to set
     */
    public void setCreaEmp(String creaEmp) {
        this.creaEmp = creaEmp;
    }

}
