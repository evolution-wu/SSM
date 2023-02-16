package com.atiguigu.spring.dao.impl;

import com.atiguigu.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功！");
    }
}
