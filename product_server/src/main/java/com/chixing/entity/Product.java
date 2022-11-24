package com.chixing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangXu
 * @since 2022-10-17
 */
@Getter
@Setter
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pro_id", type = IdType.AUTO)
    private Integer proId;

    private String proName;

    private Double proPrice;

    /**
     * 商品描述
     */
    private String proDesc;
}
