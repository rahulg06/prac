package com.project.project1.controller;

import com.project.project1.domainobject.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {
    @GetMapping("/")
    public Product getString(){
        return new Product(1L, "Toy", 50);
    }
}
