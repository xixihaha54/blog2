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
@Table(name="t_comment")
@ApiModel(description = "评论实体")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("评论id")
    private Long uid;

    @Column
    @ApiModelProperty("评论用户id")
    private Long accountId;

    @Column
    @ApiModelProperty("文章id")
    private Long articleId;

    @Column
    @ApiModelProperty("评论内容")
    private String content;

    @Column
    @ApiModelProperty("创建日期")
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @CreationTimestamp
    private Date createDate;

    @Column(insertable = false,columnDefinition = "int default 0")
    @ApiModelProperty("评论数")
    private Integer commentNum;

    @Column(insertable = false,columnDefinition = "int default 0")
    @ApiModelProperty("点赞数")
    private Integer likeNum;

//    @Column()

}
