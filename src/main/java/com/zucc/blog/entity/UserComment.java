package com.zucc.blog.entity;


import io.swagger.annotations.ApiModel;

@ApiModel("用户评论详情类")
public class UserComment {
    private User user;
    private Comment comment;

    public UserComment(){
    }

    public UserComment(Comment comment,User user){
        this.comment=comment;
        this.user=user;
    }

    public User getUser() {return user;}
    public void setUser(User user) {
        this.user = user;
    }

    public Comment getComment() {return comment;}
    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
