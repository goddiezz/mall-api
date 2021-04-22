package top.PotatoRice.mallapi.service;

import top.PotatoRice.mallapi.controller.vo.MallUserAddressVO;
import top.PotatoRice.mallapi.entity.MallUserAddress;

import java.util.List;

/**
 * @author PotatoRice
 * @description
 * @date 2021/4/22 10:12 下午
 */
public interface MallUserAddressService {
    /**
     * 获取用户收货地址列表
     * @param userId 用户id
     * @return 收货地址列表
     */
    List<MallUserAddressVO> getMyAddresses(Long userId);

    /**
     * 保存收货地址
     * @param mallUserAddress 参数
     * @return Boolean
     */
    Boolean saveUserAddress(MallUserAddress mallUserAddress);

    /**
     * 修改收货地址
     * @param mallUserAddress 参数
     * @return Boolean
     */
    Boolean updateMallUserAddress(MallUserAddress mallUserAddress);

    /**
     * 获取收货地址详情
     * @param addressId 收获地址id
     * @return 收货地址详情
     */
    MallUserAddress getMallUserAddressById(Long addressId);

    /**
     * 获取用户默认收货地址
     * @param userId 用户id
     * @return 用户默认收货地址
     */
    MallUserAddress getMyDefaultAddressByUserId(Long userId);

    /**
     * 删除收货地址
     * @param addressId 地址id     *
     * @return Boolean
     */
    Boolean deleteById(Long addressId);
}
