package com.atiguigu.test;

import com.atiguigu.mapper.DynamicSQLMapper;
import com.atiguigu.pojo.Emp;
import com.atiguigu.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DynamicMapperTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "王五",34,"男");
        List<Emp> emps = mapper.getEmpByCondition(emp);
        System.out.println(emps);
    }
}
