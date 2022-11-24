package com.chixing.controller;

import com.chixing.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CustomerController {
    @Value("server.port")
    private String serverPort;
    @Autowired
    private ICustomerService customerService;

    @GetMapping("customer/port/{serverPort}")
    public String getPort(){
        return serverPort;
    }


        @GetMapping("customer/{custId}")
    public Map<String,Object> getById(@PathVariable("custId") Integer custId){

         return customerService.getById4OtherServer(custId);

    }
}
