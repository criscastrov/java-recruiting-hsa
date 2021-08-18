package com.example.ecommerce.service;

import com.example.ecommerce.dto.CouponDTO;

import java.util.List;

public interface CouponService {

    List<CouponDTO> getAllCoupon();

    CouponDTO findCouponById(CouponDTO coupon);

}
