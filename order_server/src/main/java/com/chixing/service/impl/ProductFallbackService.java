package com.chixing.service.impl;

import com.chixing.service.ProductClient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class ProductFallbackService implements ProductClient {

    @Override
    public Map getProductById(Integer productId) {
        Map<String,Object> map = new HashMap<>();
        map.put("productId",productId);
        return map;
    }
}
