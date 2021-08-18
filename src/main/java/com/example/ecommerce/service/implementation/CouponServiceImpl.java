package com.example.ecommerce.service.implementation;

import com.example.ecommerce.client.CouponClient;
import com.example.ecommerce.dto.CouponDTO;
import com.example.ecommerce.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {

    CouponClient couponClient;

    @Autowired
    public CouponServiceImpl(CouponClient couponClient) {
        this.couponClient = couponClient;
    }

    @Override
    public List<CouponDTO> getAllCoupon() {
        return couponClient.getCoupons();
    }

    @Override
    public CouponDTO findCouponById(CouponDTO coupon) {
        return null;
    }
}
