package com.web.project.controller;

import com.web.project.model.Products;
import com.web.project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductRestController {
    private final ProductService productService;
    @GetMapping //200
    public List<Products> productsList(){
        return productService.getAllProducts();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) //201
    public void saveProduct(@RequestBody Products product){
        productService.saveProduct(product);

    }
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT) //204
    public void deleteProduct(@RequestParam Long id){
    }

    @GetMapping("/{id}")
    public Products getProductBy(@PathVariable Long id){
        return productService.getProductById(id);
    }
}
