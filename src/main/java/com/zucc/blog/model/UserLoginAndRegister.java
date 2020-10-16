package com.zucc.blog.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("登录注册model类")
public class UserLoginAndRegister {

    @ApiModelProperty(value = "账号", example = "admin", required = true)
    private String account;

    @ApiModelProperty(value = "密码", example = "123456", required = true)
    private String password;
}
