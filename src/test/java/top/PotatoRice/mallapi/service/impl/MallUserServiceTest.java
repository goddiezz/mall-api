package top.PotatoRice.mallapi.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.PotatoRice.mallapi.controller.param.MallUserUpdateParam;
import top.PotatoRice.mallapi.service.MallUserService;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MallUserServiceTest {
    @Resource
    private MallUserService mallUserService;

    @Test
    void register() {
        String register = mallUserService.register("1777233211", "1231223133213");
        log.info(register);
        assertEquals("success", register);
    }

    @Test
    void login() {
        String login = mallUserService.login("13300001111", "e10adc3949ba59abbe56e057f20f883e");        //返回了登录用户的token，会在tb_mall_user_token表生成一条token记录
        log.info(login);
    }

    @Test
    void updateUserInfo() {        //修改10号用户信息,可修改的字段为MallUserUpdateParam的属性
        MallUserUpdateParam mup = new MallUserUpdateParam();
        mup.setNickName("银翼杀手");
        mup.setPasswordMd5("e10adc3949ba59abbe56e057f20f883e");
        mup.setIntroduceSign("仿生人也会梦到电子羊吗");
        Boolean result = mallUserService.updateUserInfo(mup, 2L);
        log.info(result.toString());
        assertTrue(result);
    }

    @Test
    void logout() {        //会在tb_mall_user_token表中删掉10号用户的一条token数据
        Boolean logout = mallUserService.logout(2L);
        log.info(logout.toString());
        assertTrue(logout);
    }
}