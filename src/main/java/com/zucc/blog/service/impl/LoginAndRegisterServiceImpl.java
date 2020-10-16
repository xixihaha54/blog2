package com.zucc.blog.service.impl;

import com.zucc.blog.dao.LoginAndRegisterDao;
import com.zucc.blog.entity.Account;
import com.zucc.blog.service.LoginAndRegisterService;
import org.springframework.stereotype.Service;

@Service
public class LoginAndRegisterServiceImpl implements LoginAndRegisterService {

    private final LoginAndRegisterDao loginAndRegisterDao;

    public LoginAndRegisterServiceImpl(LoginAndRegisterDao loginAndRegisterDao) {
        this.loginAndRegisterDao = loginAndRegisterDao;
    }

    @Override
    public boolean login(Long accountId, String password) {
        if (loginAndRegisterDao.getOne(accountId).getPassword().equals(password)) {
            return true;
        } else
            return false;
    }

    @Override
    public boolean register(Long accountId, String password) {

        Account account = new Account();
        account.setUid(accountId);
        account.setPassword(password);
        loginAndRegisterDao.save(account);
        return true;

    }
}
