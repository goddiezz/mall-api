package top.PotatoRice.mallapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.PotatoRice.mallapi.entity.MallCarousel;

/**
 * @Entity top.PotatoRice.mallapi.entity.MallCarousel
 */
public interface MallCarouselMapper extends BaseMapper<MallCarousel> {

    int deleteByPrimaryKey(Long id);

    int insert(MallCarousel record);

    int insertSelective(MallCarousel record);

    MallCarousel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallCarousel record);

    int updateByPrimaryKey(MallCarousel record);

}




