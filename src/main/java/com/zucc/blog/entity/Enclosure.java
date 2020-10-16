package com.zucc.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="t_enclosure")
@ApiModel(description = "附件实体")
public class Enclosure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("附件id")
    private Long uid;

    @Column
    @ApiModelProperty("文章id")
    private Long articleId;

    @Column
    @ApiModelProperty("路径")
    private String route;

}
