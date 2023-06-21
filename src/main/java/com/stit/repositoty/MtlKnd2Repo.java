package com.stit.repositoty;

import com.stit.entity.MtlKnd2Ang;
import com.stit.entity.MtlKnd2AngPK;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlKnd2Repo extends JpaRepository<MtlKnd2Ang, MtlKnd2AngPK> {
    @Query(value = "select a from MtlKnd2Ang a where a.mtlKnd2AngPK.mtlNo1 = ?1 order by a.mtlKnd2AngPK.mtlNo2")
//    @Query(value = "select mtl_no2 from mtl_knd2_ang order by mtl_no2", nativeQuery = true)
    public Optional<List<MtlKnd2Ang>> findMtlNo2ByMtlNo1(String mtlNo1);
    
    @Query(value = "select a.mtlKnd2AngPK from MtlKnd2Ang a order by a.mtlKnd2AngPK")
//    @Query(value = "select mtl_no2 from mtl_knd2_ang order by mtl_no2", nativeQuery = true)
    public List<MtlKnd2AngPK> findAllMtlNo2();
}
