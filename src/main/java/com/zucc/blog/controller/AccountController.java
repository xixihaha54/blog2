package com.zucc.blog.controller;

import com.zucc.blog.entity.Account;
import com.zucc.blog.service.LoginAndRegisterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@Api(tags = "用户模块")
public class AccountController {
    private final LoginAndRegisterService loginAndRegisterService;
    public AccountController(LoginAndRegisterService loginAndRegisterService){
        this.loginAndRegisterService = loginAndRegisterService;
    }
    @PostMapping("/register")
    @ApiOperation(value = "新增账户")
    public boolean insert(@ApiParam("账户") @RequestBody Account account){
        return loginAndRegisterService.register(account.getUid(), account.getPassword());
    }
    @PostMapping("/login")
    @ApiOperation(value = "登录账户")
    public boolean login(@ApiParam("账户") @RequestBody Account account){
        return loginAndRegisterService.login(account.getUid(), account.getPassword());
    }
}
