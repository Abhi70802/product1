package com.example.product.controller;

import com.example.product.dto.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }


    @PostMapping(value = "/create")
    public ResponseEntity<?> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(service.createProduct(product));
    }

    @PutMapping(value = "/update")
    public ResponseEntity<?> updateProduct(@RequestBody Product product) {
        Product prod = service.updateProduct(product);
        if(null == prod){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed while updating");
        }else{
            return ResponseEntity.status(HttpStatus.FOUND).body(prod);
        }
    }

    @GetMapping(value = "/fetch/{id}")
    public ResponseEntity<?> fetchProduct(@PathVariable("id") Long id) {
        Product product = service.fetchProduct(id);
        if(null == product){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed while fetching");
        }else{
            return ResponseEntity.status(HttpStatus.FOUND).body(product);
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable("id") Long id) {
        Product product = service.deleteProduct(id);
        if(null == product){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed while deleting");
        }else{
            return ResponseEntity.status(HttpStatus.FOUND).body(product);
        }
    }

}
