package com.example.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
@componentScan
 @Enableautoconfiguration
 @Configuration
 **/
//spring framework solves the problem ofdependency injectiom
//solves duplication of code
//promotes good intergration ith other frameworks
//spring mvc provides decoupled way of developing web application
//springboot brings in auto_configuration of beans
public class BooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksApplication.class, args);

    }

}
