package top.PotatoRice.mallapi.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单收货地址关联表
 * @author loorzve
 * @TableName tb_mall_order_address
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MallOrderAddress implements Serializable {
    /**
     * 
     */
    private Long orderId;

    /**
     * 收货人姓名
     */
    private String userName;

    /**
     * 收货人手机号
     */
    private String userPhone;

    /**
     * 省
     */
    private String provinceName;

    /**
     * 城
     */
    private String cityName;

    /**
     * 区
     */
    private String regionName;

    /**
     * 收件详细地址(街道/楼宇/单元)
     */
    private String detailAddress;

    private static final long serialVersionUID = 1L;
}