package com.example.ecommerce.service.implementation;

import com.example.ecommerce.client.CategoryClient;
import com.example.ecommerce.dto.CategoryDTO;
import com.example.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    CategoryClient categoryClient;

    @Autowired
    public CategoryServiceImpl(CategoryClient categoryClient) {
        this.categoryClient = categoryClient;
    }

    @Override
    public CategoryDTO getAllCategories() {
        return categoryClient.getCategories();
    }
}
