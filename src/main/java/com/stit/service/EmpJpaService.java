package com.stit.service;

import com.stit.common.ApiResponse;
import com.stit.domain.Dept;
import com.stit.entity.EmpJpa;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class EmpJpaService {

    @PersistenceContext
    private EntityManager em;

    public void insert(EmpJpa emp) {
        try {
//            emp.setCreTs(LocalDateTime.now());
            em.persist(emp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
