package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallGoodsCategory;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallGoodsCategory
 */
public interface MallGoodsCategoryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallGoodsCategory record);

    int insertSelective(MallGoodsCategory record);

    MallGoodsCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallGoodsCategory record);

    int updateByPrimaryKey(MallGoodsCategory record);

}




