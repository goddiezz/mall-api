package top.PotatoRice.mallapi.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author PotatoRice
 * @description
 * @date 2021/4/21 11:05 上午
 */
@Data
public class SaveCartItemParam implements Serializable {

    @ApiModelProperty("商品数量")
    private Integer goodsCount;

    @ApiModelProperty("商品id")
    private Long goodsId;
}
