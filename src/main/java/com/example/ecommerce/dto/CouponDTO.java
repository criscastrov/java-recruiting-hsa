package com.example.ecommerce.dto;

import lombok.Data;

@Data
public class CouponDTO {
    private String id;
    private String description;
    private String seller;
    private String image;
    private String expiresAt;

}
