package com.stit.controller;

import com.stit.common.ApiResponse;
import com.stit.entity.Product;
import com.stit.service.ProductService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/jpa/product")
@RequestMapping("/api/jpa/product")

public class ProductController {

    @Autowired
    private ProductService prodService;

    @PostMapping("/insert")
    public ApiResponse insert(@RequestBody Product prod) {
        try {
            this.prodService.insert(prod);
            
            return ApiResponse.ok("ok");
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }
    @GetMapping("/findbyid/{prodCode}")
    public ApiResponse findById(@PathVariable String prodCode) {
        try {
            System.out.println(prodCode);
            Product product = this.prodService.findById(prodCode);
            
            return ApiResponse.ok(product);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }
    
    @GetMapping("/findall")
    public ApiResponse findAll() {
        try {
            List<Product> prodList = this.prodService.findAll();
            
            return ApiResponse.ok(prodList);
        } catch (Exception e) {
            return ApiResponse.error(e.getMessage());
        }
    }    
}
