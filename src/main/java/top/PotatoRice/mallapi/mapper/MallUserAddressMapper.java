package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallUserAddress;

import java.util.List;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallUserAddress
 */
public interface MallUserAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MallUserAddress record);

    int insertSelective(MallUserAddress record);

    MallUserAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallUserAddress record);

    int updateByPrimaryKey(MallUserAddress record);

    /**
     * 根据用户id获取默认收货地址     *     * @param userId 用户id     * @return 默认收货地址
     */
    MallUserAddress getMyDefaultAddress(Long userId);

    /**
     * 根据用户id获取用户的收货地址列表     *     * @param userId 用户id     * @return 收货地址列表
     */
    List<MallUserAddress> findMyAddressList(Long userId);
}



