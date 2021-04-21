package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallShoppingCartItem;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallShoppingCartItem
 */
public interface MallShoppingCartItemMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallShoppingCartItem record);

    int insertSelective(MallShoppingCartItem record);

    MallShoppingCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallShoppingCartItem record);

    int updateByPrimaryKey(MallShoppingCartItem record);

}




