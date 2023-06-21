package com.stit.repositoty;

import com.stit.entity.MtlKnd1Ang;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface MtlKnd1Repo extends JpaRepository<MtlKnd1Ang, String> {
	@Query(value="select a.mtlNo1 from MtlKnd1Ang a order by a.mtlNo1")
//        @Query(value="select mtl_no1 from mtl_knd1_ang order by mtl_no1", nativeQuery = true)
	public List<String> findAllMtlNo1();
}
