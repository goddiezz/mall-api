package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallUser;
import top.PotatoRice.mallapi.entity.MallUserAddress;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallUserAddress
 */
public interface MallUserAddressMapper {

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
    int insert(MallUserAddress record);

    /**
     * 自定义添加
     *
     * @param record
     * @return
     */
    int insertSelective(MallUserAddress record);

    /**
     * 主键查找
     *
     * @param id
     * @return
     */
    MallUserAddress selectByPrimaryKey(Long id);

    /**
     * 自定义主键更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(MallUserAddress record);

    /**
     * 主键更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(MallUserAddress record);

}




