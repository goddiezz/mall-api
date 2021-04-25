package top.PotatoRice.mallapi.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jni.Address;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.PotatoRice.mallapi.controller.vo.MallUserAddressVO;
import top.PotatoRice.mallapi.entity.MallUserAddress;
import top.PotatoRice.mallapi.service.MallUserAddressService;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MallUserAddressServiceImplTest {
    @Resource
    private MallUserAddressService mallUserAddressService;

    @Test
    void getMyAddresses() {
        List<MallUserAddressVO> mallUserAddressVOS = mallUserAddressService.getMyAddresses(15L);
        log.info(String.valueOf(mallUserAddressVOS));
        assertEquals(2, mallUserAddressVOS.size());
    }

    @Test
    void saveUserAddress() {
        MallUserAddress mallUserAddress = MallUserAddress.builder()
                .userId(2L)
                .userName("PotatoRice")
                .userPhone("13813826326")
                .provinceName("江苏")
                .cityName("泰州")
                .defaultFlag((byte) 0)
                .regionName("兴化")
                .detailAddress("？？？？？")
                .build();
        boolean res = mallUserAddressService.saveUserAddress(mallUserAddress);
        assertTrue(res);
    }

    @Test
    void updateMallUserAddress() {
        MallUserAddress mallUserAddress = MallUserAddress.builder()
                .addressId(4L)
                .userId(2L)
                .userName("PotatoRice")
                .userPhone("13813826326")
                .provinceName("江苏")
                .cityName("泰州")
                .defaultFlag((byte) 0)
                .regionName("兴化")
                .detailAddress("sdasddwadwad")
                .build();
        boolean res = mallUserAddressService.updateMallUserAddress(mallUserAddress);
        assertTrue(res);
    }

    @Test
    void getMallUserAddressById() {
        MallUserAddress mallUserAddress = mallUserAddressService.getMallUserAddressById(4L);
        assertEquals(2L, mallUserAddress.getUserId());
    }

    @Test
    void getMyDefaultAddressByUserId() {
        MallUserAddress mallUserAddress = mallUserAddressService.getMyDefaultAddressByUserId(15L);
        assertEquals(2L, mallUserAddress.getAddressId());
    }

    @Test
    void deleteById() {
        boolean res = mallUserAddressService.deleteById(2L);
        assertTrue(res);
    }
}