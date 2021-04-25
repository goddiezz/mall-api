package top.PotatoRice.mallapi.service.impl;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import org.springframework.stereotype.Service;
import top.PotatoRice.mallapi.controller.vo.MallIndexCarouselVO;
import top.PotatoRice.mallapi.entity.MallCarousel;
import top.PotatoRice.mallapi.mapper.MallCarouselMapper;
import top.PotatoRice.mallapi.service.MallCarouselService;
import top.PotatoRice.mallapi.util.BaseBeanUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author PotatoRice
 * @description
 * @date 2021/4/25 6:54 下午
 */
@Service
public class MallCarouselServiceImpl  implements MallCarouselService {
    @Resource
    private MallCarouselMapper mallCarouselMapper;

    @Override
    public List<MallIndexCarouselVO> getCarouselsForIndex(int number) {
        List<MallIndexCarouselVO> list = new ArrayList<>(number);
        List<MallCarousel> carousels = mallCarouselMapper.findCarouselsByNum(number);
        if (!CollectionUtils.isEmpty(carousels)) {
            list = BaseBeanUtil.copyList(carousels, MallIndexCarouselVO.class);
        }
        return list;
    }
}
