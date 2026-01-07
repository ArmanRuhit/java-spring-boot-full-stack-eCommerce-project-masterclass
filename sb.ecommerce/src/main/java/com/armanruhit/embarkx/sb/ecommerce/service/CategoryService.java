package com.armanruhit.embarkx.sb.ecommerce.service;


import com.armanruhit.embarkx.sb.ecommerce.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);

    String deleteCategory(Long categoryId);

    String updateCategory(Category category);
}
