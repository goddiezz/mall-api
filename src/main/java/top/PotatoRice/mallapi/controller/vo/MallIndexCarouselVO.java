package top.PotatoRice.mallapi.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author PotatoRice
 * @description
 * @date 2021/4/21 11:05 上午
 */
@Data
public class MallIndexCarouselVO {
    @ApiModelProperty("轮播图图片地址")
    private String carouselUrl;

    @ApiModelProperty("轮播图点击后的跳转路径")
    private String redirectUrl;
}
