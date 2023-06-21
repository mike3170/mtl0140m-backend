package com.stit.service;

import com.stit.common.ApiResponse;
import com.stit.common.ResourceNotFoundException;
import com.stit.domain.Dept;
import com.stit.entity.Product;
import com.stit.repositoty.ProductRepo;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ProductService {

    @Autowired
    private ProductRepo prodRepo;

    public void insert(Product prod) {
        try {
            this.prodRepo.save(prod);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Product prod) {
        try {
            this.prodRepo.save(prod);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Product prod) {
        try {
            this.prodRepo.delete(prod);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Product findById(String prodCode) {
        System.out.println("Service:" + prodCode);
        Optional<Product> opt = this.prodRepo.findById(prodCode);

        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new ResourceNotFoundException();
        }
    }

    public List<Product> findAll() {
        List<Product> prodList = this.prodRepo.findAll();

        if (prodList.isEmpty()){
            throw new ResourceNotFoundException();
        }
        return prodList;
    }
}
