package com.zucc.blog.controller;


import com.zucc.blog.common.Result;
import com.zucc.blog.common.ResultGenerator;
import com.zucc.blog.entity.Comment;
import com.zucc.blog.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
@Api(tags = "评论模块")
public class CommentController {

    private  final CommentService commentService;

    public  CommentController(CommentService commentService) {this.commentService=commentService;}

    @PostMapping("/addComment")
    @ApiOperation(value = "添加评论" , notes = "")
    public Result<Comment> addComment(
            @ApiParam("添加")
            @RequestBody Comment comment
            ){
        return ResultGenerator.genSuccess(commentService.addComment(comment));
    }
}
