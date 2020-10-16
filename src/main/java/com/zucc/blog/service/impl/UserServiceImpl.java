package com.zucc.blog.service.impl;

import com.zucc.blog.common.Result;
import com.zucc.blog.common.ResultGenerator;
import com.zucc.blog.dao.UserRepository;
import com.zucc.blog.entity.User;
import com.zucc.blog.model.UserLoginAndRegister;
import com.zucc.blog.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Result<User> registerUser(UserLoginAndRegister userLoginAndRegister) {
        if(userLoginAndRegister.getAccount() == null || userLoginAndRegister.getAccount().equals("")){
            return ResultGenerator.genResult(500, "账号为空", null);
        }
        if(userLoginAndRegister.getPassword() == null || userLoginAndRegister.getPassword().equals("")){
            return ResultGenerator.genResult(500, "密码为空", null);
        }
        if(userRepository.findUserByAccount(userLoginAndRegister.getAccount()) == null){
            User user = new User();
            user.setAccount(userLoginAndRegister.getAccount());
            user.setPassword(userLoginAndRegister.getPassword());
            userRepository.save(user);
            return ResultGenerator.genResult(200, "注册成功", user);
        } else {
            return ResultGenerator.genResult(500, "账户已存在", null);
        }
    }

    @Override
    public Result<User> loginUser(UserLoginAndRegister userLoginAndRegister) {
        if(userLoginAndRegister.getAccount() == null || userLoginAndRegister.getAccount().equals("")){
            return ResultGenerator.genResult(500, "账号为空", null);
        }
        if(userLoginAndRegister.getPassword() == null || userLoginAndRegister.getPassword().equals("")){
            return ResultGenerator.genResult(500, "密码为空", null);
        }
        User user = userRepository.findUserByAccount(userLoginAndRegister.getAccount());
        if( user == null){
            return ResultGenerator.genResult(500, "账号不存在", null);
        } else {
            if(user.getPassword().equals(userLoginAndRegister.getPassword())){
                return ResultGenerator.genResult(200, "登录成功", user);
            } else {
                return ResultGenerator.genResult(500, "密码错误", null);
            }
        }
    }

    @Override
    public Result<User> findUser(Long uid) {
        User user = userRepository.findById(uid).get();
        if(user == null){
            return ResultGenerator.genResult(500, "用户不存在", null);
        }
        return ResultGenerator.genResult(200, "登录成功", user);
    }

    @Override
    public Result<List<User>> findAllUser() {
        List<User> userList = userRepository.findAll();
        if(userList == null){
            return ResultGenerator.genResult(500, "用户列表为空", null);
        }
        return ResultGenerator.genResult(200, "登录成功", userList);
    }
}
