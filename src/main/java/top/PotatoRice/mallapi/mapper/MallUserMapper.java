package top.PotatoRice.mallapi.mapper;

import org.apache.ibatis.annotations.Param;
import top.PotatoRice.mallapi.entity.MallUser;

import java.util.List;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallUser
 */
public interface MallUserMapper {

    /**
     * 主键删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加
     *
     * @param record
     * @return
     */
    int insert(MallUser record);

    /**
     * 自定义添加
     *
     * @param record
     * @return
     */
    int insertSelective(MallUser record);

    /**
     * 主键查找
     *
     * @param id
     * @return
     */
    MallUser selectByPrimaryKey(Long id);

    /**
     * 自定义主键更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(MallUser record);

    /**
     * 主键更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(MallUser record);

    /**
     * 查找全部
     *
     * @param
     * @return
     */
    List<MallUser> selectAll();

    /**
     * 根据登录名查询用户
     * @param loginName 登录名
     * @return 用户对象
     */
    MallUser selectByLoginName(String loginName);

    /**
     * 根据登录名和密码查询用户
     * @param loginName 登录名
     * @param password 密码
     * @return 用户对象
     */
    MallUser selectByLoginNameAndPasswd(@Param("loginName") String loginName, @Param("password") String password);

}




