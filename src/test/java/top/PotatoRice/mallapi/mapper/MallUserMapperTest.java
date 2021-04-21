package top.PotatoRice.mallapi.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.PotatoRice.mallapi.entity.MallUser;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MallUserMapperTest {
    @Resource
    private MallUserMapper mallUserMapper;


    @Test
    void selectByPrimaryKey() {
        MallUser mallUser;
        mallUser = mallUserMapper.selectByPrimaryKey(1L);
        System.out.println(mallUser);
    }

    @Test
    void selectAll() {
        List<MallUser> mallUsers = mallUserMapper.selectAll();
        System.out.println(mallUsers);
    }
}