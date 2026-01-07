package com.project.project1.controller;

import com.project.project1.domainobject.Product;
import com.project.project1.serviceinterface.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/")
    public Product getString(){
        return new Product(1L, "Toy", 50);
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){
        try {
            productService.addProduct(product);
        }
        catch (Exception e){
            System.out.println("ssssssssssssssssssssssssssss");
        }
        return "Product Added";

    }

    @GetMapping("/getProduct/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id){
        Product product = productService.getProduct(id);
        if (product!=null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        else{
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }
    }
}
