package com.stit.repositoty;

import com.stit.entity.BasVenMastAng;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BasVenMastRepo extends JpaRepository<BasVenMastAng, String> {
}
