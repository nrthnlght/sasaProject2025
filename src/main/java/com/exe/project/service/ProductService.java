package com.exe.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exe.project.model.Product;
import com.exe.project.repository.ProductCrudRepository;

@Service
public class ProductService {

    @Autowired
    private ProductCrudRepository productCrudRepository;

    public Product createProduct(Product product) {
        return productCrudRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return (List<Product>) productCrudRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productCrudRepository.findById(id);
    }

}
    