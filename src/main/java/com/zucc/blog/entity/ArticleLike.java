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
@Table(name = "articleLike")
@ApiModel(description = "点赞实体")
public class ArticleLike {
    @Id
    @ApiModelProperty("点赞id")
    private long uid;

    @Column
    @ApiModelProperty("文章id")
    private Long articleId;

    @Column
    @ApiModelProperty("用户id")
    private Long accountId;
}
