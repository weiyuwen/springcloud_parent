package com.chixing.service;

import com.chixing.service.impl.ProductFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;



@FeignClient(value = "eshop-product-server",fallback = ProductFallbackService.class)
public interface ProductClient {
    @GetMapping("/product/{productId}")
    public Map getProductById(@PathVariable("productId") Integer productId );
}
