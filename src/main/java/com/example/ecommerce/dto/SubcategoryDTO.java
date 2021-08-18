package com.example.ecommerce.dto;

import lombok.Data;

import java.util.List;

@Data
public class SubcategoryDTO{
    public String id;
    public String name;
    public int relevance;
    public List<SubcategoryDTO> subcategories;
    public String largeImageUrl;
    public String mediumImageUrl;
    public String smallImageUrl;
    public String iconImageUrl;
}
