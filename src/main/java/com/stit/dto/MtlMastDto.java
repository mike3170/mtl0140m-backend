package com.stit.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import lombok.Data;
@Data
public class MtlMastDto {
    private String mtlNo1;
    private String mtlNo2;
    private String mtlNo3;
    private String mtlNo;
    private String mtlName;
    private String mtlSpec;
    private String mtlGrade;
    private String location;
    private String stkYn;
    private String purUnit;
    private BigDecimal tranRate;
    private String stkUnit;
    private String ctrlUomYn;
    private String leastBuy;
    private BigDecimal saveQty;
    private BigDecimal leadTime;
    private BigDecimal inAllow;
    private String useUnit;
    private BigDecimal pcsPerKg;
    private String stopYn;
    private LocalDate stopDate;
    private String stopEmp;
    private String firstInDate;
    private String lastInDate;
    private String lastIssuDate;
    private String pictNo;
    private String accNo;
    private String material;
    private BigDecimal reqCycle;
    private BigDecimal stdUsedQty;
    private Date editDate;
    private String editEmp;
    private Date creaDate;
    private String creaEmp;
    private String remark;
    
    private String mtlKnd1Name;
    private String mtlKnd2Name;
}
