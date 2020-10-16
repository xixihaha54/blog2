package com.zucc.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="t_collection")
@ApiModel(description = "文章收藏实体")
public class Collection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("收藏id")
    private Long uid;

    @Column
    @ApiModelProperty("用户id")
    private Long accountId;

    @Column
    @ApiModelProperty("文章id")
    private Long articleId;
}
