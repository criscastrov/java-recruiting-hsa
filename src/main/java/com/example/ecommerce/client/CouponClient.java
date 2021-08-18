package com.example.ecommerce.client;

import com.example.ecommerce.dto.CouponDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "coupons", url = "https://cs-hsa-api-coupons-rest.herokuapp.com")
public interface CouponClient {

    @RequestMapping(value = "/coupons", method = RequestMethod.GET)
    List<CouponDTO> getCoupons();

}
