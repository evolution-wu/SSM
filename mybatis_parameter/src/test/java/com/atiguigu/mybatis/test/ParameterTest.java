package com.atiguigu.mybatis.test;

import com.atiguigu.mapper.UserMapper;
import com.atiguigu.pojo.User;
import com.atiguigu.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ParameterTest {
    @Test
    public void testgetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User root2 = mapper.getUserByName("root2");
        System.out.println(root2);
    }

    @Test
    public void testcheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User root2 = mapper.checkLogin("root2","88888888");
        System.out.println(root2);
    }


    @Test
    public void testcheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("username","root");
        map.put("password", "123");
        User root2 = mapper.checkLoginByMap(map);
        System.out.println(root2);
    }

    @Test
    public void testinsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null,"ichikawa","20020107",22,"男","1981740090@qq.com");
        mapper.insertUser(user);

    }

    @Test
    public void checkLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("ichikawa", "20020107");
        System.out.println(user);

    }
}
