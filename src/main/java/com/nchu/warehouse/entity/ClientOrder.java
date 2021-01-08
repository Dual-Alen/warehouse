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
@ApiModel(value="ClientOrder对象", description="")
public class ClientOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "CID")
    private Integer cid;

    @ApiModelProperty(value = "OID")
    private Integer oid;

    @ApiModelProperty(value = "订单类型")
    private String type;


}
