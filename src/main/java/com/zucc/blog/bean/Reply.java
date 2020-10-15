package com.zucc.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "reply")
@ApiModel(description = "评论回复实体")
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("回复id")
    private long uid;

    @Column
    @ApiModelProperty("回复用户id")
    private Long accountId;

    @Column
    @ApiModelProperty("评论id")
    private Long commentId;

    @Column
    @ApiModelProperty("回复内容")
    private String content;

}
