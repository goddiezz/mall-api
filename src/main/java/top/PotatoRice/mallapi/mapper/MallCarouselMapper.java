package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallCarousel;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallCarousel
 */
public interface MallCarouselMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallCarousel record);

    int insertSelective(MallCarousel record);

    MallCarousel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallCarousel record);

    int updateByPrimaryKey(MallCarousel record);

}




