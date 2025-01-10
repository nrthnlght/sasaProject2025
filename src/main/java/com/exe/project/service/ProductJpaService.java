package com.exe.project.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.exe.project.model.Product;
import com.exe.project.repository.ProductJpaRep;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductJpaService {
    
    private final ProductJpaRep productJpaRep;

    public void deleteAllByIdInBatch(Iterable<Long> ids){

        productJpaRep.deleteAllByIdInBatch(ids);

    }
    
    public void deleteAllInBatch(){

        productJpaRep.deleteAllInBatch();

    }

    public void deleteAllInBatch(Iterable<Product> namaBarang){

        productJpaRep.deleteAllInBatch(namaBarang);

    }

    // public void deleteInBatch(Iterable<Product> namaBarang){

    //     productJpaRep.deleteInBatch(namaBarang);

    // }

    public <S extends Product> List <Product> findAll(Example <Product> example){

        return productJpaRep.findAll(example);

    }

    public List<Product> findAll(Example<Product> example, Sort sort) {

        return productJpaRep.findAll(example, sort);

    }
    
    public void flush(){

        productJpaRep.flush();

    }

    // use getReferenceById instead
    // public Product getById(Long id){
    //     return productJpaRep.getById(id);
    // }

    // use getReferenceById instead
    // public Product getOne(Long id){
    //     return productJpaRep.getOne(id);
    // }

    public Product getReferenceById(Long id){

        return productJpaRep.getReferenceById(id);

    }

    public <S extends Product> List<S> saveAllAndFlush(Iterable<S> namaBarang){

        return productJpaRep.saveAllAndFlush(namaBarang);

    }

    public <S extends Product> S saveAndFlush(S namaBarang){

        return productJpaRep.saveAndFlush(namaBarang);
        
    }
}
