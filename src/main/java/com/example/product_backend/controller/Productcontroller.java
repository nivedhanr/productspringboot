package com.example.product_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Productcontroller {
    @PostMapping("/")
    public String Home(){
        return "Welcome to Homepage";
    }
    @PostMapping("/add")
    public String Product_add(){
        return "Welcome to add product";
    }
    @PostMapping("/search")
    public String ProductSearch(){
        return "welcome to search page";
    }
}
