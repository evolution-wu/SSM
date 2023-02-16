package com.atiguigu.spring.controller;

import com.atiguigu.spring.service.BookService;
import com.atiguigu.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId,Integer bookId){
        bookService.buyBook(userId,bookId);
    }
    //一次购买多本图书
    public void checkout( Integer userId,Integer[] bookIds) {
        checkoutService.checkout(userId,bookIds);
    }

}
