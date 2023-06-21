package com.stit.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class MtlKnd2Dto {
    private String mtlNo1;
    private String mtlNo2;
    private String knd2Name;
    private String accNo;
    private String stkYn;
    private String rmtlYn;
    private String dmtlYn;
    private LocalDateTime creaDate;
    private String creaEmp;
    private LocalDateTime editDate;
    private String editEmp;

}
