package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallUser;

import java.util.List;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallUser
 */
public interface MallUserMapper {

    /**
     * 主键删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加
     * @param record
     * @return
     */
    int insert(MallUser record);

    /**
     * 自定义添加
     * @param record
     * @return
     */
    int insertSelective(MallUser record);

    /**
     * 主键查找
     * @param id
     * @return
     */
    MallUser selectByPrimaryKey(Long id);

    /**
     * 自定义主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(MallUser record);

    /**
     * 主键更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(MallUser record);

    /**
     * 查找全部
     * @param
     * @return
     */
    List<MallUser> selectAll();

}




