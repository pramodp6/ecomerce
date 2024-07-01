package com.pramod.ecomerce.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
@CrossOrigin("*")
public class ProductController {

     @GetMapping("/productDetails")
    public String productDetails(){
         return "Product Details";
     }

    @GetMapping("/productDetailsSearch")
    public String productDetailsSerach(){
        return "productDetailsSerach";
    }
}
