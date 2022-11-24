package com.chixing.service;

import com.chixing.entity.Myorder;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangXu
 * @since 2022-10-17
 */
public interface IMyorderService extends IService<Myorder> {
    public Map getOrderDetail(Integer orderId);
}
