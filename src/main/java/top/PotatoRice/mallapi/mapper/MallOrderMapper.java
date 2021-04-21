package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallOrder;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallOrder
 */
public interface MallOrderMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallOrder record);

    int insertSelective(MallOrder record);

    MallOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallOrder record);

    int updateByPrimaryKey(MallOrder record);

}




