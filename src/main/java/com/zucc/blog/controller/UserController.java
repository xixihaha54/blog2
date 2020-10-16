package com.zucc.blog.controller;

import com.zucc.blog.common.Result;
import com.zucc.blog.entity.User;
import com.zucc.blog.model.UserLoginAndRegister;
import com.zucc.blog.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags = "用户模块")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    @ApiOperation(value = "用户注册")
    public Result<User> registerUser(@ApiParam("账号") @RequestBody UserLoginAndRegister userLoginAndRegister){
        return userService.registerUser(userLoginAndRegister);
    }

    @PostMapping("/login")
    @ApiOperation(value = "用户登录")
    public Result<User> loginUser(@ApiParam("账号") @RequestBody UserLoginAndRegister userLoginAndRegister){
        return userService.loginUser(userLoginAndRegister);
    }

    @PostMapping("/finduser")
    @ApiOperation(value = "根据id查找用户")
    public Result<User> findUser(@ApiParam("用户id") @RequestParam Long uid){
        return userService.findUser(uid);
    }

    @PostMapping("/findalluser")
    @ApiOperation(value = "查找所有用户")
    public Result<List<User>> findAllUser(){
        return userService.findAllUser();
    }

    @PostMapping("/modifyuser")
    @ApiOperation(value = "用户修改")
    public Result<User> modifyUser(@ApiParam("账号") @RequestBody User user){
        return userService.modifyUser(user);
    }

}
