package com.exe.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.exe.project.model.Product;

public interface ProductCrudRepository extends CrudRepository <Product, Long>{
    
}
