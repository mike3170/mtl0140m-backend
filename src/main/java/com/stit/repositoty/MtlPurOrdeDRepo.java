/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stit.repositoty;

import com.stit.entity.MtlPurOrdeDAng;
import com.stit.entity.MtlPurOrdeDAngPK;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mike
 */
@Repository
public interface MtlPurOrdeDRepo extends JpaRepository<MtlPurOrdeDAng, MtlPurOrdeDAngPK> {
    @Query( value = "SELECT m.mtlPurOrdeDAngPK FROM MtlPurOrdeDAng m WHERE m.mtlPurOrdeDAngPK.poNo = ?1")
//    @Query( value = "SELECT po_no, item_no FROM mtl_pur_orde_d_ang WHERE po_no = ?1", nativeQuery = true)
List<MtlPurOrdeDAngPK> findDetailPk(String poNo);    
//    List<MtlPurOrdeDAngPK> findDetailPk(String poNo);    
}
