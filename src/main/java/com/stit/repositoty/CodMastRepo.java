package com.stit.repositoty;

import com.stit.dto.CodMastDto;
import com.stit.entity.CodMast;
import com.stit.entity.CodMastPK;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CodMastRepo extends JpaRepository<CodMast, CodMastPK> {

    @Query(value = "select m from CodMast m where m.codMastPK.kind = ?1")
    public List<CodMast> findByKind(String kind);
    
    @Query(value = "select m.codeName from CodMast m where m.codMastPK = ?1")
    public String getCodeName(CodMastPK pk);
}
