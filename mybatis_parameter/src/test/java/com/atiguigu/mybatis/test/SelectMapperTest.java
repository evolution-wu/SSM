package com.atiguigu.mybatis.test;

import com.atiguigu.mapper.SelectMapper;
import com.atiguigu.pojo.User;
import com.atiguigu.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SelectMapperTest {
    @Test
    public void TestgetUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
    }

    @Test
    public void TestgetAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> allUser = mapper.getAllUser();
        for (int i = 0; i < allUser.size(); i++) {
            System.out.println(allUser.get(i));
        }
    }

    @Test
    public void TestgetCount(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
    }

    @Test
    public void TestgetUserByIdtoMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> userByIdToMap = mapper.getUserByIdToMap(1);
        System.out.println(userByIdToMap);
    }

    @Test
    public void TestgetALLUsertoMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Map<String, Object>> allUserToMap = mapper.getAllUserToMap();
        Map<String, Object> allUserToMap2 = mapper.getAllUserToMap2();
        System.out.println(allUserToMap2);
        System.out.println(allUserToMap);

    }
}
