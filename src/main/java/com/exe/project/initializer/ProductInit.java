package com.exe.project.initializer;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.exe.project.service.GenerateProduct;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProductInit implements ApplicationRunner {
    
    private final GenerateProduct generateProduct;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        generateProduct.createReadData();
    }
}
