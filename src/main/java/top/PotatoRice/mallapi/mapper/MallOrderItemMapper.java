package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallOrderItem;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallOrderItem
 */
public interface MallOrderItemMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallOrderItem record);

    int insertSelective(MallOrderItem record);

    MallOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallOrderItem record);

    int updateByPrimaryKey(MallOrderItem record);

}




