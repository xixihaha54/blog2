package com.zucc.blog.controller;

import com.zucc.blog.common.Result;
import com.zucc.blog.entity.User;
import com.zucc.blog.model.UserLoginAndRegister;
import com.zucc.blog.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(tags = "用户模块")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    @ApiOperation(value = "注册用户")
    public Result<User> addUser(@ApiParam("账号") @RequestBody UserLoginAndRegister userLoginAndRegister){
        return userService.registerUser(userLoginAndRegister);
    }
}
