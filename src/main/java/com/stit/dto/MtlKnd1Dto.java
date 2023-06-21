package com.stit.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class MtlKnd1Dto {

    private String mtlNo1;
    private String knd1Name;
    private String stkKind;
    private LocalDateTime creaDate;
    private String creaEmp;
    private LocalDateTime editDate;
    private String editEmp;

}
