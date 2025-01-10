package com.exe.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exe.project.model.Product;

@Repository
public interface ProductCrudRep extends CrudRepository <Product, Long>{
    
}
