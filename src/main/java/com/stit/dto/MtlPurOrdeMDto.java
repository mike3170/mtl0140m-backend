package com.stit.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mike
 */
@Data
public class MtlPurOrdeMDto {

    String poNo;
    LocalDate poDate;
    String venNo;
    String poKind;
    String currNo;
    String paymentTerm;
    Integer payDays;
    String payKind;
    Integer canQtyUp;
    Integer canQtyDn;
    LocalDateTime editDate;
    String editEmp;
    LocalDateTime creaDate;
    String creaEmp;
}
