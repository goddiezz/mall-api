package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallUserToken;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallUserToken
 */
public interface MallUserTokenMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallUserToken record);

    int insertSelective(MallUserToken record);

    MallUserToken selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallUserToken record);

    int updateByPrimaryKey(MallUserToken record);

}




