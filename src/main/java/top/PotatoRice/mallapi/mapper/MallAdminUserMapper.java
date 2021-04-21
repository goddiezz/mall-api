package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallAdminUser;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallAdminUser
 */
public interface MallAdminUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallAdminUser record);

    int insertSelective(MallAdminUser record);

    MallAdminUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallAdminUser record);

    int updateByPrimaryKey(MallAdminUser record);

}




