package com.zucc.blog.dao;

import com.zucc.blog.entity.Article;
import com.zucc.blog.entity.UserArticle;
import com.zucc.blog.entity.WarticleLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long>{
    List<Article> findAllByTitleLike(String title);

    @Query(value = "SELECT new com.zucc.blog.entity.UserArticle(u,a) FROM Article u left join User a on u.accountId=a.uid")
    public List<UserArticle> findAllUserArticle();

}
