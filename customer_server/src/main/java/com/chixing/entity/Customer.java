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
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cust_id", type = IdType.AUTO)
    private Integer custId;

    private String custName;

    private Long custTelno;

    private String custEmail;
}
