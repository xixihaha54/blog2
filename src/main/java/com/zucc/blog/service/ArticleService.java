package com.zucc.blog.service;

import com.zucc.blog.entity.Article;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ArticleService {

    Article addArticle(Article article);

    List<Article> findAllByTitleLike(String title);

    List<Article> findAll();

    Page<Article> findArticleByPage(String title,Integer pageNo ,Integer pageSize);

   // Page<Article> findArticleByPageNew(String name, Integer pageNo, Integer pageSize);

}
