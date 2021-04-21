package top.PotatoRice.mallapi.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author PotatoRice
 * @description
 * @date 2021/4/21 11:04 上午
 */
@Data
public class MallUserRegisterParam implements Serializable {
    @ApiModelProperty("登录名")
    @NotEmpty(message = "登录名不能为空")
    private String loginName;
    @ApiModelProperty("用户密码")
    @NotEmpty(message = "密码不能为空")
    private String password;
}