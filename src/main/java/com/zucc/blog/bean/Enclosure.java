package com.zucc.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "enclosure")
@ApiModel(description = "附件实体")
public class Enclosure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("附件id")
    private long uid;

    @Column
    @ApiModelProperty("文章id")
    private long articleId;

    @Column
    @ApiModelProperty("路径")
    private String route;

}
