package top.PotatoRice.mallapi.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author PotatoRice
 * @description
 * @date 2021/4/21 11:05 上午
 */
@Data
public class SecondLevelCategoryVO implements Serializable {

    @ApiModelProperty("当前二级分类id")
    private Long categoryId;

    @ApiModelProperty("父级分类id")
    private Long parentId;

    @ApiModelProperty("当前分类级别")
    private Byte categoryLevel;

    @ApiModelProperty("当前二级分类名称")
    private String categoryName;

    @ApiModelProperty("三级分类列表")
    private List<ThirdLevelCategoryVO> thirdLevelCategoryVos;
}