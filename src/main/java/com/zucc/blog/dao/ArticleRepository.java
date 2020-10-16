package com.zucc.blog.dao;

import com.zucc.blog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long>{
    List<Article> findAllByTitleLike(String title);

    //Article

}
