package com.stit.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import lombok.Data;

@Data
public class BasVenMastDto {
    private String venNo;
    private String venName;
    private String venAbbr;
    private String venNameE;
    private String taxId;
    private String paymentTerm;
    private String payKind;
    private BigDecimal payDays;
    private String currNo;
    private String invKind;
    private String taxKind;
    private String billStart;
    private String billEnd;
    private String foreign;
    private BigDecimal lowProcAmt;
    private String stopYn;
    private String buyDsct;
    private BigDecimal dsctLimt;
    private BigDecimal dsctRate;
    private String lossType;
    private BigDecimal lossRate;
    private String venAddr1;
    private String venAddr2;
    private Date creaDate;
    private String creaEmp;
    private Date editDate;
    private String editEmp;
    private BigDecimal wireLoss;

    private String payTermName;
    private String payKindName;
    private String invKindName;
    private String texKindName;
    private String cstName;
    private String makeAbilityName;
    private String qualityName;

}
