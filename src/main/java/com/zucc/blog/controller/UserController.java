package com.zucc.blog.controller;

import com.zucc.blog.bean.User;
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

    @PostMapping("/insert")
    @ApiOperation(value = "新增用户")
    public void insert(@ApiParam("用户") @RequestBody User user){
        userService.insert(user);
    }

    @GetMapping("/findbyuid")
    @ApiOperation(value = "根据uid查询用户")
    public User findOne(@ApiParam("用户uid") @RequestParam Long uid){
        return userService.select(uid);
    }

    @PostMapping("/delete")
    @ApiOperation(value = "根据uid删除用户")
    public void delete(@ApiParam("用户uid") @RequestParam Long uid){
        userService.delete(uid);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新用户信息")
    public void update(@ApiParam("用户信息") @RequestBody User user){
        userService.update(user);
    }

    @GetMapping("findall")
    @ApiOperation(value = "查找所有用户信息")
    public List<User> findAll(){
        return userService.findAll();
    }
}
