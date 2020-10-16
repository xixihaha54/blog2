package com.zucc.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="t_label")
@ApiModel(description = "文章标签实体")
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("标签id")
    private Long uid;

    @Column
    @ApiModelProperty("文章id")
    private Long articleId;

    @Column
    @ApiModelProperty("标签内容")
    private String content;
}
