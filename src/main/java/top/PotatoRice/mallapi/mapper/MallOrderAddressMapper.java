package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallOrderAddress;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallOrderAddress
 */
public interface MallOrderAddressMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallOrderAddress record);

    int insertSelective(MallOrderAddress record);

    MallOrderAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallOrderAddress record);

    int updateByPrimaryKey(MallOrderAddress record);

}




