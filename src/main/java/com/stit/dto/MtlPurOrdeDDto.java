/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stit.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * @author mike
 */
@Data
public class MtlPurOrdeDDto {
String poNo;
Short itemNo;
String mtlNo;
Integer verNo;
Float poPrice;
Float poQty;
Float poAmt;
LocalDate preDate;
String stkUnit;
String purUnit;
Float inQty;
Float retnQty;
Float canlQty;
String autoYn;
String endCode;
String endReason;
String remark;
LocalDateTime editDate;
String editEmp;
LocalDateTime creaDate;
String creaEmp;
}
