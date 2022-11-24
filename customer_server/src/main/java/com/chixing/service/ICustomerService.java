package com.chixing.service;

import com.chixing.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;


public interface ICustomerService extends IService<Customer> {
    public Map<String,Object> getById4OtherServer(Integer custId);
}
