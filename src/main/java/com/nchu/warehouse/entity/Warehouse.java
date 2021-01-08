package com.nchu.warehouse.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2021-01-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Warehouse对象", description="")
public class Warehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "仓库名")
    private String name;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "总容量")
    private Double capacity;

    @ApiModelProperty(value = "已使用")
    private Double used;

    @ApiModelProperty(value = "备注")
    private String note;


}
