package top.PotatoRice.mallapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.PotatoRice.mallapi.entity.MallGoodsCategory;

import java.util.List;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallGoodsCategory
 */
public interface MallGoodsCategoryMapper extends BaseMapper<MallGoodsCategory> {
    /**
     * 根据分类层级和分类名称查询分类信息
     *
     * @param categoryLevel 分类层级
     * @param categoryName  分类名称
     * @return 分类信息
     */
    MallGoodsCategory selectByLevelAndName(@Param("categoryLevel") Byte categoryLevel,
                                           @Param("categoryName") String categoryName);

    /**
     * 根据分类层级和父级分类id和数量查询分类信息
     *
     * @param parentIds     父级分类id
     * @param categoryLevel 分类层级
     * @param number        数量
     * @return 分类信息
     */
    List<MallGoodsCategory> selectByLevelAndParentIdsAndNumber(@Param("parentIds") List<Long> parentIds,
                                                               @Param("categoryLevel") int categoryLevel,
                                                               @Param("number") int number);


}




