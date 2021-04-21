package top.PotatoRice.mallapi.mapper;

import top.PotatoRice.mallapi.entity.MallIndexConfig;

/**
 * @author loorzve
 * @Entity top.PotatoRice.mallapi.entity.MallIndexConfig
 */
public interface MallIndexConfigMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallIndexConfig record);

    int insertSelective(MallIndexConfig record);

    MallIndexConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallIndexConfig record);

    int updateByPrimaryKey(MallIndexConfig record);

}




