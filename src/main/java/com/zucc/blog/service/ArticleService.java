package com.zucc.blog.service;

import com.zucc.blog.entity.Article;
import com.zucc.blog.entity.UserArticle;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ArticleService {

    Article addArticle(Article article);

    List<Article> findAllByTitleLike(String title);

    Article findAllByUid(Long uid);

    List<Article> findAll();


    Page<Article> findArticleByPage(String title,Integer pageNo ,Integer pageSize);

    List<UserArticle> findAllUserArticle();




}
