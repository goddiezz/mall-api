package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.User;

/**
 * @Entity top.PotatoRice.mallapi.entity.User
 */
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}




