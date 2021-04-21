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
public class UpdateCartItemParam implements Serializable {

    @ApiModelProperty("购物项id")
    private Long cartItemId;

    @ApiModelProperty("商品数量")
    private Integer goodsCount;
}
