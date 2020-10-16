package com.zucc.blog.dao;

import com.zucc.blog.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginAndRegisterDao extends JpaRepository<Account,Long> {

}
