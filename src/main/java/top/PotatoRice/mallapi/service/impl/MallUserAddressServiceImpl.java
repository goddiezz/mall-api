package top.PotatoRice.mallapi.service.impl;

import org.springframework.stereotype.Service;
import top.PotatoRice.mallapi.common.MallException;
import top.PotatoRice.mallapi.common.ServiceResultEnum;
import top.PotatoRice.mallapi.controller.vo.MallUserAddressVO;
import top.PotatoRice.mallapi.entity.MallUserAddress;
import top.PotatoRice.mallapi.mapper.MallUserAddressMapper;
import top.PotatoRice.mallapi.service.MallUserAddressService;
import top.PotatoRice.mallapi.util.BaseBeanUtil;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author PotatoRice
 * @description
 * @date 2021/4/22 10:13 下午
 */
@Service
public class MallUserAddressServiceImpl implements MallUserAddressService {
    @Resource
    private MallUserAddressMapper mallUserAddressMapper;

    @Override
    public List<MallUserAddressVO> getMyAddresses(Long userId) {
        List<MallUserAddress> myAddressList = mallUserAddressMapper.findMyAddressList(userId);
        return BaseBeanUtil.copyList(myAddressList, MallUserAddressVO.class);
    }

    @Override
    public Boolean saveUserAddress(MallUserAddress mallUserAddress) {
        Date now = new Date();
        if (mallUserAddress.getDefaultFlag().intValue() == 1) {
            //添加默认地址，需要将原有的默认地址修改掉
            MallUserAddress defaultAddress = mallUserAddressMapper.getMyDefaultAddress(mallUserAddress.getUserId());
            if (defaultAddress != null) {
                defaultAddress.setDefaultFlag((byte) 0);
                defaultAddress.setUpdateTime(now);
                int updateResult = mallUserAddressMapper.updateByPrimaryKeySelective(defaultAddress);
                if (updateResult < 1) {
                    //未更新成功
                    MallException.fail(ServiceResultEnum.DB_ERROR.getResult());
                }
            }
        }
        return mallUserAddressMapper.insertSelective(mallUserAddress) > 0;
    }

    @Override
    public Boolean updateMallUserAddress(MallUserAddress mallUserAddress) {
        MallUserAddress tempAddress = getMallUserAddressById(mallUserAddress.getAddressId());
        //需要将参数中的地址修改为默认地址
        if (mallUserAddress.getDefaultFlag().intValue() == 1) {
            //先获取原来的默认地址
            MallUserAddress defaultAddress = mallUserAddressMapper.getMyDefaultAddress(mallUserAddress.getUserId());
            if (defaultAddress != null) {
                //存在默认地址且默认地址并不是当前修改的地址
                defaultAddress.setDefaultFlag((byte) 0);
                defaultAddress.setUpdateTime(new Date());
                int updateResult = mallUserAddressMapper.updateByPrimaryKeySelective(defaultAddress);
                if (updateResult < 1) {
                    //未更新成功
                    MallException.fail(ServiceResultEnum.DB_ERROR.getResult());
                }
            }
        }
        mallUserAddress.setUpdateTime(new Date());
        return mallUserAddressMapper.updateByPrimaryKeySelective(mallUserAddress) > 0;
    }

    @Override
    public MallUserAddress getMallUserAddressById(Long addressId) {
        MallUserAddress mallUserAddress = mallUserAddressMapper.selectByPrimaryKey(addressId);
        if (mallUserAddress == null) {
            MallException.fail(ServiceResultEnum.DATA_NOT_EXIST.getResult());
        }
        return mallUserAddress;
    }

    @Override
    public MallUserAddress getMyDefaultAddressByUserId(Long userId) {
        return mallUserAddressMapper.getMyDefaultAddress(userId);
    }

    @Override
    public Boolean deleteById(Long addressId) {
        return mallUserAddressMapper.deleteByPrimaryKey(addressId) > 0;
    }
}