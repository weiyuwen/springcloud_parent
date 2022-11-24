package com.chixing.controller;

import com.chixing.entity.Product;
import com.chixing.service.IProductService;
import com.chixing.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangXu
 * @since 2022-10-17
 */
@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("product/{productId}")
    public Product getById(@PathVariable("productId")Integer productId){
        Product product =  productService.getById(productId);
        return product;
    }
}
