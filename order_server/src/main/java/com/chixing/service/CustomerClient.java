package com.chixing.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;
@FeignClient("eshop-customer-server")
public interface CustomerClient {
    @GetMapping("/customer/{customerId}")
    public Map getCustomerById(@PathVariable("customerId") Integer customerId );
}
