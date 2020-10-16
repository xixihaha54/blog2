package com.zucc.blog.service;

import com.zucc.blog.common.Result;
import com.zucc.blog.entity.User;
import com.zucc.blog.model.UserLoginAndRegister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    Result<User> registerUser (UserLoginAndRegister userLoginAndRegister);
    Result<User> loginUser (UserLoginAndRegister userLoginAndRegister);
    Result<User> findUser (Long uid);
    Result<List<User>> findAllUser();

}
