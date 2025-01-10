package com.exe.project.controller;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exe.project.model.Product;
import com.exe.project.service.ProductJpaService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/ProductJpaApi")
@RequiredArgsConstructor
public class ProductJpaController {

    private static final int List = 0;

    private static final int Product = 0;

    private final ProductJpaService productJpaService;

    @GetMapping("/Jpa/deleteAllByIdInBatch")
    public void getDeleteAllIdInBatch(Iterable<Long> ids) {

        productJpaService.deleteAllByIdInBatch(ids);

    }

    @GetMapping("/Jpa/deleteAllInBatch")
    public void getDeleteAllInBatch() {

        productJpaService.deleteAllInBatch();

    }

    @GetMapping("/Jpa/deleteAllInBatchIterable")
    public void getDeleteAllInBatch(Iterable<Product> namaBarang) {

        productJpaService.deleteAllInBatch(namaBarang);

    }

    //deprecated
    // @GetMapping("/Jpa/deleteInBatch")
    // public void getDeleteInBatch(Iterable<Product> namaBarang){

    // productJpaService.deleteInBatch(namaBarang);

    // }

    @GetMapping("/Jpa/findAll")
    public Iterable<Product> getFindAll(Example<Product> example) {

        return productJpaService.findAll(null);

    }

    @GetMapping("/Jpa/findAllSort")
    public List<Product> getFindAll(@RequestBody Example<Product> example, Sort sort) {

        return productJpaService.findAll(example, sort);

    }

    @GetMapping("/Jpa/flush")
    public void getflush() {
        productJpaService.flush();
    }

    //deprecated
    // @GetMapping("/Jpa/getById")
    // public Product getById(Long id){
    // return productJpaService.getById(id);
    // }

    //deprecated
    // @GetMapping("/Jpa/getOne")
    // public Product getOne(Long id){
    // return productJpaService.getOne(id);
    // }

    @GetMapping("/Jpa/getReferenceById")
    public Product getReferenceById(Long id) {

        return productJpaService.getReferenceById(id);
        
    }

    @GetMapping("/Jpa/saveAllAndFlush")
    public Iterable<Product> saveAllAndFlush(Iterable<Product> namaBarang) {

        return productJpaService.saveAllAndFlush(null);

    }

    @GetMapping("/Jpa/saveAndFlush")
    public Iterable<Product> saveAndFlush(String namaBarang) {

        return productJpaService.saveAndFlush(null);

    }
}
