package com.zucc.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "article")
@ApiModel(description = "文章实体")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("文章id")
    private long uid;

    @Column
    @ApiModelProperty("标题")
    private String title;

    @Column
    @ApiModelProperty("内容")
    private String content;

    @Column
    @ApiModelProperty("内容简介")
    private String contentDetails;

    @Column
    @ApiModelProperty("缩略图")
    private String thumbnail;

    @Column
    @ApiModelProperty("作者id")
    private Long accountId;

    @Column
    @ApiModelProperty("创建日期")
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @CreationTimestamp
    private Date createDate;

    @Column(insertable = false,columnDefinition = "int default 0")
    @ApiModelProperty("浏览量")
    private Integer viewNum;

    @Column(insertable = false,columnDefinition = "int default 0")
    @ApiModelProperty("评论数")
    private Integer commentNum;

    @Column(insertable = false,columnDefinition = "int default 0")
    @ApiModelProperty("点赞数")
    private Integer likeNum;

    @Column(insertable = false,columnDefinition = "boolean default false")
    @ApiModelProperty("是否被删除")
    private Boolean isDeleted;

}
