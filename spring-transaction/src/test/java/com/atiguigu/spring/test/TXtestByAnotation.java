package com.atiguigu.spring.test;

import com.atiguigu.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class TXtestByAnotation {
    @Autowired
    private BookController bookController;
    @Test
    public void test(){
        bookController.checkout(1,new Integer[]{1,2});
    }

}
