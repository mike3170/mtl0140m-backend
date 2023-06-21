package com.stit.repositoty;

import com.stit.dto.MtlMastFindWindowDto;
import com.stit.entity.MtlMastAng;
import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface MtlMastRepo extends JpaRepository<MtlMastAng, String> {
	@Query(value="select a.mtlNo from MtlMastAng a order by a.mtlNo")
//        @Query(value = "select mtl_no from mtl_mast order by mtl_no", nativeQuery = true)
	public List<String> findAllMtlNo();
        
//        @Query(value = """
//                       SELECT mtl_no 
//                         FROM mtl_mast_ang 
//                        WHERE mtl_no BETWEEN NVL(?1, mtl_no)
//                                         AND NVL(?2, mtl_no)
//                          AND mtl_grade = NVL(?3, mtl_grade)
//                       """, nativeQuery = true)        
        
        @Query(value = """
                       SELECT mtl_no 
                         FROM mtl_mast_ang 
                        WHERE mtl_no BETWEEN DECODE(?1, NULL, mtl_no,?1)
                                         AND DECODE(?2, NULL, mtl_no,?2)
                          AND mtl_grade = DECODE(?3, NULL, mtl_grade,?3)
                       """, nativeQuery = true)
//        @Query(value="select m.mtlNo from MtlMastAng m where m.mtlNo between COALESCE(?1,m.mtlNo) and COALESCE(?2,m.mtlNo) and m.mtlGrade = COALESCE(?3,m.mtlGrade) ")
        public List<String> findWindow(String mtlNoB, String mtlNoE, String mtlGrade);
}
