package com.atiguigu.mybatis.test;

import com.atiguigu.mapper.UserMapper;
import com.atiguigu.pojo.User;
import com.atiguigu.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void testinsert() throws IOException {
        //获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取sqlsessionfactorybulider对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlsessionfactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sql的会话对象sqlsession(不会自动提交事务) 是mybatis提供的操作数据库的对象
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取sql的会话对象sqlsession(会自动提交事务) 是mybatis提供的操作数据库的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
      //获取usermapper的代理实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用mapper接口中的方法，实现添加操作
        int result = mapper.insetUser();

        /*还有一种

        int result = sqlSession.insert("com.atiguigu.mapper.UserMapper.insetUser");
         */

        System.out.println("结果："+result);
        //提交事务
       // sqlSession.commit();
        //关闭对话
        sqlSession.close();

    }

    @Test
    public void testUpdate(){
              SqlSession sqlSession = SqlSessionUtil.getSqlsession();
              UserMapper mapper = sqlSession.getMapper(UserMapper.class);
              mapper.updateUser();
              sqlSession.close();
    }

    @Test
    public void testDelete(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
        sqlSession.close();
    }

    @Test
    public void testgetUserByID(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userByID = mapper.getUserByID();
        System.out.println(userByID);
    }
    @Test
    public void testgetAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        for (int i = 0; i < allUser.size(); i++) {
            System.out.println(allUser.get(i));
        }

    }
}
