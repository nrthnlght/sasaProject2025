package com.exe.project.controller;
import com.exe.project.model.Product;
import com.exe.project.service.ProductCrudService;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ProductCrudApi")
@RequiredArgsConstructor

 public class ProductCrudController {

    private final ProductCrudService productCrudService;


    @GetMapping("/crud/long")
    public long getCount(){

        return productCrudService.getCount();

    }

    @GetMapping("/crud/delete")
    public void getDelete(Long id){

        productCrudService.delete(id);

    }

    @GetMapping("/crud/deleteAll")
    public void getDeleteAll(){

        productCrudService.DeleteAll();
        
    }

    @GetMapping("/crud/deleteAllEntities")
    public void getDeleteAll(Iterable<? extends Long> id){
        productCrudService.deleteAll(id);
    }

    @GetMapping("/crud/deleteAllById")
    public void getDeleteAllById(Iterable<? extends Long> ids){
        productCrudService.deleteAllById(null);
    }

    @GetMapping("/crud/deleteById")
    public void getDeleteById(Long id){
        productCrudService.deleteById(id);
    }

    @GetMapping("/crud/existById")
    public boolean getExistById(Long id){
        return productCrudService.existById(id);
    }

    @GetMapping("/crud/findAll")
    public Iterable<Product> getFindAll() {
        return productCrudService.findAll();
    }

    @GetMapping("/crud/findAllById")
    public Iterable<Product> getFindAllById(Iterable<Long> ids){
        return productCrudService.findAllById(ids);
    }

    @GetMapping("/crud/findById")
    public Optional<Product> getFindAllById(Long id){
        return productCrudService.findById(id);
    }
}
