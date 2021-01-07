package com.nchu.warehouse.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author youmoweidai
 * @since 2021-01-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="OrderList对象", description="")
public class OrderList implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "商品编号")
    private String num;

    @ApiModelProperty(value = "商品名")
    private String name;

    @ApiModelProperty(value = "订单编号")
    @TableField("orderNum")
    private String ordernum;

    @ApiModelProperty(value = "商品价格")
    private Double price;

    @ApiModelProperty(value = "商品数量")
    private Integer count;

    @ApiModelProperty(value = "是否支付")
    private Boolean pay;

    @ApiModelProperty(value = "下单时间")
    private Date date;

    @ApiModelProperty(value = "是否发货")
    private Boolean transport;

    @ApiModelProperty(value = "快递单号")
    @TableField("orderState")
    private String orderstate;

    @ApiModelProperty(value = "总金额")
    @TableField("sumPrice")
    private Double sumprice;

    private String note;


}
