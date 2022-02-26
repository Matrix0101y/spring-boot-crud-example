package com.javatechie.springbootcrudexample.data.repository;

import com.javatechie.springbootcrudexample.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByName(String name);
}
