package com.zucc.blog.entity;


import java.io.Serializable;

public class WarticleLike implements Serializable {

    private Article article;
    private ArticleLike articleLike;

    public WarticleLike(){

    }

    public WarticleLike(Article article){
        ArticleLike articleLike = new ArticleLike();
        this.article = article;
        this.articleLike = articleLike;
    }

    public WarticleLike(ArticleLike articleLike){
        Article article = new Article();
        this.article = article;
        this.articleLike = articleLike;
    }

    public WarticleLike(Article article,ArticleLike articleLike){
        this.article = article;
        this.articleLike = articleLike;
    }
}
