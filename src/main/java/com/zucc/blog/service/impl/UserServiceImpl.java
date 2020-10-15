package com.zucc.blog.service.impl;

import com.zucc.blog.bean.User;
import com.zucc.blog.dao.UserDao;
import com.zucc.blog.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void delete(Long uid) {
        userDao.deleteById(uid);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public User select(Long uid) {
        return userDao.findById(uid).get();
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void insert(User user) {
        userDao.save(user);
    }
}
