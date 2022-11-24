package com.chixing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
public class Myorder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    private String orderNum;

    private Integer custId;

    private Integer proId;

    private BigDecimal orderPrice;

    private LocalDateTime orderCreateTime;

    private String orderStatus;
}
