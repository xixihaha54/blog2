package com.zucc.blog.service;

public interface LoginAndRegisterService {
    boolean login(Long accountId, String password);
    boolean register(Long accountId, String password);

}
