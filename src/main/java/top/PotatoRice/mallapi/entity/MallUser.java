package top.PotatoRice.mallapi.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author loorzve
 * @TableName tb_mall_user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("tb_mall_user")
public class MallUser implements Serializable {
    /**
     * 用户主键id
     */
    @TableId
    private Long userId;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 登陆名称(默认为手机号)
     */
    private String loginName;

    /**
     * MD5加密后的密码
     */
    private String passwordMd5;

    /**
     * 个性签名
     */
    private String introduceSign;

    /**
     * 
     */
    private String address;

    /**
     * 注销标识字段(0-正常 1-已注销)
     */
    private Byte isDeleted;

    /**
     * 锁定标识字段(0-未锁定 1-已锁定)
     */
    private Byte lockedFlag;

    /**
     * 注册时间
     */
    private Date createTime;

    /**
     * 头像
     */
    private String avatar;

    private static final long serialVersionUID = 1L;
}