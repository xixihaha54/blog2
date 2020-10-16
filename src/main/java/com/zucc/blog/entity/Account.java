package com.zucc.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "account")
@ApiModel(description = "账号实体")
public class Account {
    @Id
    @ApiModelProperty("账号id")
    private long uid;

    @Column
    @ApiModelProperty("密码")
    private String password;

    @Column
    @ApiModelProperty("用户名")
    private String username;

    @Column
    @ApiModelProperty("头像")
    private String userhead;


}
