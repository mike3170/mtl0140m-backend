package com.stit.repositoty;

import com.stit.entity.BasCstMast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BasCstMastRepo extends JpaRepository<BasCstMast, String> {
}
