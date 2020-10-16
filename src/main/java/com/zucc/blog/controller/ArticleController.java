package com.zucc.blog.controller;

import com.zucc.blog.common.Result;
import com.zucc.blog.common.ResultGenerator;
import com.zucc.blog.entity.Article;
import com.zucc.blog.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
@Api(tags = "文章模块")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {this.articleService = articleService; }

    @PostMapping("/addArticle")
   @ApiOperation(value = "添加文章" , notes = "")
    public Result<Article> addArticle(
           @ApiParam("添加")
            @RequestBody Article article
    ){
        return ResultGenerator.genSuccess(articleService.addArticle(article));
    }

    @ApiOperation(value = "根据文章标题获取文章", notes = "")
    @PostMapping("/findtitle")
    public Result<List<Article>> findAllByTitleLike(
            @ApiParam("搜索")
            @RequestParam String title
    ){
        return  ResultGenerator.genSuccess(articleService.findAllByTitleLike(title));
    }

    @ApiOperation(value = "获取所有文章", notes = "")
    @GetMapping("/findAll")
    public Result<List<Article>> findAll(){
        return  ResultGenerator.genSuccess(articleService.findAll());
    }

    @ApiOperation(value = "分页获取", notes = "")
    @PostMapping("/fenfind")
    public Result<Page<Article>> findArticleByPage(
            @ApiParam(value = "名称")
            @RequestParam(required = false) String title,
            @ApiParam(value = "当前页码", required = true)
            @RequestParam Integer pageNo,
            @ApiParam(value = "每页多少条", required = true)
            @RequestParam Integer pageSize
    ){
        return ResultGenerator.genSuccess(articleService.findArticleByPage(title,pageNo,pageSize));
    }
}
