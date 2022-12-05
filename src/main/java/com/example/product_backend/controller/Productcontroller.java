package com.example.product_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Productcontroller {
    @PostMapping("/")
    public String Home(){
              return "Welcome to Homepage";
          }
}
