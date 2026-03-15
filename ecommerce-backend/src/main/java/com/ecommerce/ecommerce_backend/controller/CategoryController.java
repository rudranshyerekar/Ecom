package com.ecommerce.ecommerce_backend.controller;

import com.ecommerce.ecommerce_backend.model.Category;
import com.ecommerce.ecommerce_backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }

    @GetMapping
    public List<Category> getCategories(){
        return categoryService.getAllCategories();
    }
}