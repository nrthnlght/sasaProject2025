package com.exe.project.controller;

import java.util.List;
import java.util.Optional;

import com.exe.project.model.Product;
import com.exe.project.service.ProductJpaService;
import com.exe.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductJpaService productJpaService;

    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        System.out.println("Product: " + product.getNamaBarang());
        System.out.println("Harga: " + product.getHargaBarang());
        System.out.println("Stock: " + product.getStok());
    Product createdProduct = productService.createProduct(product);
    return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    //CRUD
    @GetMapping("/crud")
    public ResponseEntity<List<Product>> getCrud() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/crud/{id}")
    public ResponseEntity<Product> getProductByIdCrud(@PathVariable Long id) {
        Optional<Product> product = productService.getProductById(id);
        return product.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //JPA
    @GetMapping("/jpa")
    public ResponseEntity<List<Product>> getJpa() {
        List<Product> products = productJpaService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/jpa/{id}")
    public ResponseEntity<Product> getProductByIdJpa(@PathVariable Long id) {
        Optional<Product> product = productJpaService.getProductById(id);
        return product.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
}
