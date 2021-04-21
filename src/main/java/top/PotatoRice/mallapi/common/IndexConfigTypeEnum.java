package top.PotatoRice.mallapi.common;

import javax.xml.bind.annotation.XmlType;

/**
 * @author PotatoRice
 * @description： 首页配置项枚举 1搜索框热搜 2搜索下拉框热搜 3首页热销商品 4首页新品上线 5首页为你推荐
 * @date 2021/4/20 11:14 上午
 */
public enum IndexConfigTypeEnum {
    /**
     * 默认值
     */
    DEFAULT(0, "DEFAULT"),
    /**
     * 搜索框热搜
     */
    INDEX_SEARCH_HOTS(1, "INDEX_SEARCH_HOTS"),
    /**
     * 搜索下拉框热搜
     */
    INDEX_SEARCH_DOWN_HOTS(2, "INDEX_SEARCH_DOWN_HOTS"),
    /**
     * 首页热销商品
     */
    INDEX_GOODS_HOT(3, "INDEX_GOODS_HOT"),
    /**
     * 首页新品上线
     */
    INDEX_GOODS_NEW(4, "INDEX_GOODS_NEW"),
    /**
     * 首页为你推荐
     */
    INDEX_GOODS_RECOOMEND(5, "INDEX_GOODS_RECOOMEND");

    private int type;

    private String name;


    IndexConfigTypeEnum(int type, String name) {
        this.name = name;
        this.type = type;
    }

    public static IndexConfigTypeEnum getIndexConfigTypeEnumByType(int type) {
        for (IndexConfigTypeEnum indexConfigTypeEnum : IndexConfigTypeEnum.values()) {
            if (indexConfigTypeEnum.getType() == type) {
                return indexConfigTypeEnum;
            }
        }
        return DEFAULT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
