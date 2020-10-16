package com.zucc.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "label")
@ApiModel(description = "文章标签实体")
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("标签id")
    private long uid;

    @Column
    @ApiModelProperty("文章id")
    private long articleId;

    @Column
    @ApiModelProperty("标签内容")
    private String content;
}
