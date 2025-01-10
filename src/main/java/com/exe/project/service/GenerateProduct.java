package com.exe.project.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.exe.project.model.Product;
import com.exe.project.repository.ProductJpaRep;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GenerateProduct {
    
    private final ProductJpaRep productJpaRep;

    private final String[] barang = {
        "Jaket", "Sweater", "Baju", "Kaos", "Celana", "Kaos Kaki", "Sepatu", "Topi"
    };

    private final int[] harga = {
        80000, 110000, 50000, 145000, 100000, 300000, 125000, 250000, 70000
    };

    public void createReadData() {
        Random random = new Random();

        for (int i = 1; i <= 100; i++) {
            Product product = new Product();

            String namaBarang = barang[random.nextInt(barang.length)];
            product.setNamaBarang(namaBarang + i);

            int hargaBarang = harga[random.nextInt(harga.length)];
            product.setHargaBarang(hargaBarang);

            product.setStok(random.nextInt(100) + 1);

            productJpaRep.save(product);
        }
    }
}
