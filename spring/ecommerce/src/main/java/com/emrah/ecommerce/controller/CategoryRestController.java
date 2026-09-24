package com.emrah.ecommerce.controller;

import com.emrah.ecommerce.entity.CategoryEntity;
import com.emrah.ecommerce.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryRestController {
    private final CategoryService service;
    @GetMapping
    public List<CategoryEntity> findAll(){
        return service.getAllCategories();
    }
}
