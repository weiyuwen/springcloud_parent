package com.chixing.service.impl;

import com.chixing.entity.Product;
import com.chixing.mapper.ProductMapper;
import com.chixing.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangXu
 * @since 2022-10-17
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
