package com.web.project.service;

import com.web.project.exception.ProductNotFoundException;
import com.web.project.model.Products;
import com.web.project.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }
    public void saveProduct(Products product) {
        productRepository.save(product);
    }

    public Products getProductById(Long id) {
        Products products= productRepository.findById(id);
        if (products==null){
            throw new ProductNotFoundException("Product with id " + id + " not found");
        }else{
            return products;
        }
    }
}
