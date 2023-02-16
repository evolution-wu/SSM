package com.atiguigu.spring.test;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class datasourceTest {
    @Test
    public void test() throws SQLException {
        ApplicationContext IOC = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource druidDataSource = IOC.getBean(DruidDataSource.class);
        System.out.println(druidDataSource.getConnection());
    }
}
