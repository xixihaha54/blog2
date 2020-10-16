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
@Table(name="t_article_like")
@ApiModel(description = "点赞实体")
public class ArticleLike {
    @Id
    @ApiModelProperty("点赞id")
    private Long uid;

    @Column
    @ApiModelProperty("文章id")
    private Long articleId;

    @Column
    @ApiModelProperty("用户id")
    private Long accountId;
}
