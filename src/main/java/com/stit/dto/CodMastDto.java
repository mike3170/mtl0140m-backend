package com.stit.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;

@Data
public class CodMastDto {
	private String kind;
	private String codeNo;
	private String codeName;
	private String codeNameE;
	private BigDecimal qty;
	private String text;
	private BigDecimal qty1;
	private String text1;
	private BigDecimal qty2;
	private String text2;
	private BigDecimal qty3;
	private String text3;
	private BigDecimal qty4;
	private String text4;
	private String remarks;
	private String stopYn;
        private LocalDate stopDate;
        private String stopEmp;
	private String editEmp;
        private LocalDate editDate;
	private String creaEmp;
        private LocalDate creaDate;
}
