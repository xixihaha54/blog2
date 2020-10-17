package com.zucc.blog.entity;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@ApiModel("用户文章详情类")
public class UserArticle  {
    private Article article;
    private User user;

    public UserArticle(){

    }

//    public UserArticle(Article article){
//
//        this.article = article;
//        this.user = user;
//    }
//
//    public UserArticle(User user){
//        Article article = new Article();
//        this.article = article;
//        this.user = user;
//    }

    public UserArticle(Article article,User user){
        this.article = article;
        this.user = user;
    }

    public User getUser() {return user;}
    public void setUser(User user) {
        this.user = user;
    }

    public Article getArticle() {return article;}
    public void setArticle(Article article) {
        this.article = article;
    }
}
