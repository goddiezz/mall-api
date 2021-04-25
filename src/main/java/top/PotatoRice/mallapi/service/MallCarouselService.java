package top.PotatoRice.mallapi.service;

import top.PotatoRice.mallapi.controller.vo.MallIndexCarouselVO;

import java.util.List;

/**
 * @author PotatoRice
 * @description
 * @date 2021/4/25 6:53 下午
 */
public interface MallCarouselService {
    /**
     * 返回固定数量的轮播图对象(首页调用)
     *
     * @param number 数量
     * @return 轮播图集合
     */
    List<MallIndexCarouselVO> getCarouselsForIndex(int number);

}
