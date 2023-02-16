package com.atiguigu.mybatis.test;

import com.atiguigu.mapper.SpecialSQLMapper;
import com.atiguigu.pojo.User;
import com.atiguigu.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SpecialSQLTest {
    @Test
    public void testGetUserLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> users = mapper.getUserByLike("a");
        System.out.println(users);
    }


    @Test
    public void testdeletemore(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMore("7,8");
    }

    @Test
    public void testgetAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> tUser = mapper.getAllUser("t_user");
        System.out.println(tUser);
    }

    @Test
    public void testinsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null,"xiaoming","12222",22,"女","11111@email.com");
        mapper.insertUser(user);
    }
}
