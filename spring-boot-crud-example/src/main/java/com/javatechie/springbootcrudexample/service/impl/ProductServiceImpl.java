package com.javatechie.springbootcrudexample.service.impl;

import com.javatechie.springbootcrudexample.data.entity.Product;
import com.javatechie.springbootcrudexample.data.repository.ProductRepository;
import com.javatechie.springbootcrudexample.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public String deleteProduct(Long id) {
        productRepository.deleteById(id);
        return "product removed ! ! " + id;
    }

    public void updateProduct(Long id, Product product) {
        Product existingProduct = productRepository.findById(id).get();
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        productRepository.save(existingProduct);
    }

}
