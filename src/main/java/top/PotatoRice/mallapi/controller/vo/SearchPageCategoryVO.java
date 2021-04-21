package top.PotatoRice.mallapi.controller.vo;

import lombok.Data;
import top.PotatoRice.mallapi.entity.MallGoodsCategory;

import java.io.Serializable;
import java.util.List;

/**
 * @author PotatoRice
 * @description
 * @date 2021/4/21 11:05 上午
 */
@Data
public class SearchPageCategoryVO implements Serializable {

    private String firstLevelCategoryName;

    private List<MallGoodsCategory> secondLevelCategoryList;

    private String secondLevelCategoryName;

    private List<MallGoodsCategory> thirdLevelCategoryList;

    private String currentCategoryName;

}
