package com.trial.ecommerce.service;

import com.trial.ecommerce.dto.CategoryRequest;
import com.trial.ecommerce.dto.CategoryResponse;

import java.util.List;

public interface CategoryService {

    CategoryResponse createCategory(CategoryRequest request);

    List<CategoryResponse> getAllCategories();

    CategoryResponse getCategoryById(Long id);

    void deleteCategory(Long id);
}