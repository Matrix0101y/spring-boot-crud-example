package com.javatechie.springbootcrudexample.service;

import com.javatechie.springbootcrudexample.data.entity.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> saveProducts(List<Product> products);

    List<Product> getProducts();

    Product getProductById(Long id);

    Product getProductByName(String name);

    void updateProduct(Long id, Product product);

    String deleteProduct(Long id);
}
