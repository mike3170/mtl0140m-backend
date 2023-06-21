/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROD_CODE")
    private String prodCode;
    @Basic(optional = false)
    @Column(name = "PROD_NAME")
    private String prodName;
    @Basic(optional = false)
    @Column(name = "PROD_LINE")
    private String prodLine;
    @Basic(optional = false)
    @Column(name = "PROD_SCALE")
    private String prodScale;
    @Basic(optional = false)
    @Column(name = "PROD_VENDOR")
    private String prodVendor;
    @Basic(optional = false)
    @Column(name = "PROD_DESC")
    private String prodDesc;
    @Basic(optional = false)
    @Column(name = "QTY_IN_STOCK")
    private int qtyInStock;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "BUY_PRICE")
    private BigDecimal buyPrice;


    public Product() {
    }

    public Product(String prodCode) {
        this.prodCode = prodCode;
    }

    public Product(String prodCode, String prodName, String prodLine, String prodScale, String prodVendor, String prodDesc, int qtyInStock, BigDecimal buyPrice) {
        this.prodCode = prodCode;
        this.prodName = prodName;
        this.prodLine = prodLine;
        this.prodScale = prodScale;
        this.prodVendor = prodVendor;
        this.prodDesc = prodDesc;
        this.qtyInStock = qtyInStock;
        this.buyPrice = buyPrice;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdLine() {
        return prodLine;
    }

    public void setProdLine(String prodLine) {
        this.prodLine = prodLine;
    }

    public String getProdScale() {
        return prodScale;
    }

    public void setProdScale(String prodScale) {
        this.prodScale = prodScale;
    }

    public String getProdVendor() {
        return prodVendor;
    }

    public void setProdVendor(String prodVendor) {
        this.prodVendor = prodVendor;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodCode != null ? prodCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.prodCode == null && other.prodCode != null) || (this.prodCode != null && !this.prodCode.equals(other.prodCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stit.entity.Product[ prodCode=" + prodCode + " ]";
    }

}
