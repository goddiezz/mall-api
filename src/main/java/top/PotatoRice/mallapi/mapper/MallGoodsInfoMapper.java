package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallGoodsInfo;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallGoodsInfo
 */
public interface MallGoodsInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallGoodsInfo record);

    int insertSelective(MallGoodsInfo record);

    MallGoodsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallGoodsInfo record);

    int updateByPrimaryKey(MallGoodsInfo record);

}




