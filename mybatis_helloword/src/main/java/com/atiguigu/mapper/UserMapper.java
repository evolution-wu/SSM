package com.atiguigu.mapper;

import com.atiguigu.pojo.User;

import java.util.List;

public interface UserMapper
{
    int insetUser();

    void updateUser();

    void deleteUser();

    User getUserByID();  //查询一条数据

    List<User> getAllUser();  //查询所有的记录，用list容器
}
