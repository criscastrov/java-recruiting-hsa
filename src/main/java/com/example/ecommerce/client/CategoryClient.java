package com.example.ecommerce.client;

import com.example.ecommerce.dto.CategoryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "categories", url = "https://cs-hsa-api-categories-rest.herokuapp.com")
public interface CategoryClient {

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    CategoryDTO getCategories();
}
