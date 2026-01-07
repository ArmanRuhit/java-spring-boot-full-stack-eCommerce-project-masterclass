package com.armanruhit.embarkx.sb.ecommerce.service;

import com.armanruhit.embarkx.sb.ecommerce.model.Category;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    private Long nextId = 1L;


    private List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryId(nextId++);
        categories.add(category);
    }

    @Override
    public String deleteCategory(Long categoryId) {
        Category category = categories.stream().filter(c -> c.getCategoryId().equals(categoryId)).findFirst().orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        categories.remove(category);
        return "Category with categoryId: "+categoryId+" deleted successfully";
    }

    @Override
    public String updateCategory(Category category) {
        Category old = categories.stream().filter(c -> c.getCategoryId().equals(category.getCategoryId())).findFirst().orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category with id: "+category.getCategoryId()
        +" not found"));

        old.setCategoryName(category.getCategoryName());

        


        return "";
    }
}
