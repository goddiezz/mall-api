package top.PotatoRice.mallapi.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author loorzve
 * @TableName tb_mall_admin_user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MallAdminUser implements Serializable {
    /**
     * 管理员id
     */
    private Integer adminUserId;

    /**
     * 管理员登陆名称
     */
    private String loginUserName;

    /**
     * 管理员登陆密码
     */
    private String loginPassword;

    /**
     * 管理员显示昵称
     */
    private String nickName;

    /**
     * 是否锁定 0未锁定 1已锁定无法登陆
     */
    private Byte locked;

    private static final long serialVersionUID = 1L;
}