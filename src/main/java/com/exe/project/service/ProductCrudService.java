package com.exe.project.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exe.project.model.Product;
import com.exe.project.repository.ProductCrudRep;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductCrudService {

    private final ProductCrudRep productCrudRepository;

    public long getCount(){

        return productCrudRepository.count();

    }

    public void delete(Long id){
        productCrudRepository.deleteById(id);

        System.out.println("Produk dengan id " + id + "berhasil di hapus");

    }

    public void DeleteAll(){

        productCrudRepository.deleteAll();
        System.out.println("Semua Produk berhasil di hapus");

    }

    public void deleteAll(Iterable<? extends Long> id){

        productCrudRepository.deleteAll(findAll());

    }

    @SuppressWarnings("null")
    public void deleteAllById(Iterable<? extends Long> ids){

        productCrudRepository.deleteAllById(null);

    }

    public void deleteById(Long id){

        productCrudRepository.deleteById(id);

    }

    public boolean existById(Long id){

        return productCrudRepository.existsById(id);

    }

    public Iterable<Product> findAll() {

        return productCrudRepository.findAll();

    }

    public Iterable<Product> findAllById(Iterable<Long> ids){

        return productCrudRepository.findAllById(ids);

    }

    public Optional<Product> findById(Long id){

        return productCrudRepository.findById(id);
        
    }

}
    