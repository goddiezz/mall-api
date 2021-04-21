package top.PotatoRice.mallapi.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author PotatoRice
 * @description
 * @date 2021/4/21 11:05 上午
 */
@Data
public class MallIndexGoodsVO {
    @ApiModelProperty("商品id")
    private Long goodsId;

    @ApiModelProperty("商品名称")
    private String goodsName;

    @ApiModelProperty("商品简介")
    private String goodsIntro;

    @ApiModelProperty("商品图片地址")
    private String goodsCoverImg;

    @ApiModelProperty("商品价格")
    private Integer sellingPrice;

    @ApiModelProperty("商品标签")
    private String tag;
}
