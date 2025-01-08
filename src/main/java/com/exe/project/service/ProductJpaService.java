package com.exe.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exe.project.model.Product;
import com.exe.project.repository.ProductJpaRepository;

@Service
public class ProductJpaService {
    
    @Autowired
    private ProductJpaRepository productJpaRepository;

    public Product createProduct(Product product) {
        return productJpaRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return (List<Product>) productJpaRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productJpaRepository.findById(id);
    }
}
