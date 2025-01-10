package com.exe.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exe.project.model.Product;

@Repository
public interface ProductJpaRep extends JpaRepository <Product, Long>{

}