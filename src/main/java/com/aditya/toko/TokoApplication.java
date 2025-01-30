package com.aditya.toko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication(scanBasePackages = "com.aditya.toko")
@EntityScan(basePackages = "com.aditya.toko")
public class TokoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TokoApplication.class, args);
    }
}
