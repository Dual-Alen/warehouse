package com.nchu.warehouse.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value="Goods对象", description="")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "商品编号")
    private String num;

    @ApiModelProperty(value = "商品名")
    private String name;

    @ApiModelProperty(value = "商品类型")
    private String type;

    @ApiModelProperty(value = "规格型号")
    @TableField("speModel")
    private String spemodel;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "总数")
    private Double sum;

    @ApiModelProperty(value = "入库进价")
    @TableField("inPrice")
    private Double inprice;

    @ApiModelProperty(value = "出库售价")
    @TableField("outPrice")
    private Double outprice;

    @ApiModelProperty(value = "最低库存")
    private Double cordon;

    @ApiModelProperty(value = "备注")
    private String note;


}
