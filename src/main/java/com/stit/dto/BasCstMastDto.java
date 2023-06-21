package com.stit.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;

@Data
public class BasCstMastDto {
    private String cstNo;
    private String cstName;
    private String cstAbbr;
    private String cstType;
    private String locaNo;
    private String salesman;
    private String grupNo;
    private String shipCompany;
    private String triangleYn;
    private BigDecimal discount;
    private BigDecimal advDsct;
    private String currNo;
    private String deliMethod;
    private String priceTerm;
    private String pricePort;
    private String destination;
    private String customBroker;
    private String paymentTerm;
    private String payKind;
    private BigDecimal payDays;
    private String taxId;
    private String invKind;
    private String taxKind;
    private BigDecimal closeDd;
    private String taxPriceYn;
    private String category;
    private String bankNo;
    private String bankName;
    private String swiftCode;
    private String accoNo;
    private String bankAddr;
    private String bankRemark;
    private String stopYn;
    private LocalDate stopDate;
    private String stopEmp;
    private BigDecimal upRate;
    private LocalDate dnRate;
    private String webSite;
    private String cstAddr1;
    private String cstAddr2;
    private String cstAddr3;
    private String packing;
    private String payment;
    private String ordRemarks;
    private String cstRemarks;
    private String shipMarkE;
    private String samplePlan;

}
