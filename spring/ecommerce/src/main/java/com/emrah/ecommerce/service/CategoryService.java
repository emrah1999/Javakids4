package com.emrah.ecommerce.service;

import com.emrah.ecommerce.entity.CategoryEntity;
import com.emrah.ecommerce.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<CategoryEntity> getAllCategories(){
        return categoryRepository.findAll();
    }
}
