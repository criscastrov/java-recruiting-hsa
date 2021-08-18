package com.example.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CategoryDTO {
    private String id;
    private String name;
    private int relevance;
    private List<SubcategoryDTO> subcategories;
}
