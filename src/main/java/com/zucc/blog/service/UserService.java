package com.zucc.blog.service;

import com.zucc.blog.bean.User;

import java.util.List;

public interface UserService {
    void insert(User user);
    void delete(Long uid);
    void update(User user);
    User select(Long uid);
    List<User> findAll();
}
