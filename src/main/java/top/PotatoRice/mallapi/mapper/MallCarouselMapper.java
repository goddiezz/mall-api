package top.PotatoRice.mallapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.PotatoRice.mallapi.entity.MallCarousel;

import java.util.List;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallCarousel
 */
public interface MallCarouselMapper extends BaseMapper<MallCarousel> {
    /**
     * 查询number个轮播图数据
     *
     * @param number 数量
     * @return 轮播图
     */
    List<MallCarousel> findCarouselsByNum(@Param("number") int number);
}




