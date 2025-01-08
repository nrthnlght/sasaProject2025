package com.exe.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exe.project.model.Product;

public interface ProductJpaRepository extends JpaRepository <Product, Long>{

}
