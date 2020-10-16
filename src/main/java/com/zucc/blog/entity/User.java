package com.zucc.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="t_user")
@ApiModel(description = "用户model")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("用户id")
    private Long uid;

    @Column(unique = true)
    @ApiModelProperty(value = "账号", example = "admin", required = true)
    private String account;

    @Column
    @ApiModelProperty(value = "密码", example = "123456", required = true)
    private String password;

    @Column
    @ApiModelProperty(value = "姓名", example = "张三")
    private String name;

    @Column
    @ApiModelProperty(value = "头像")
    private String headPicture;

}
