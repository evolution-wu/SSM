package com.atiguigu.spring.dao;

public interface BookDao {
    void updateBalance(Integer userId, Integer price);

    void updateStock(Integer bookId);

    Integer getPriceByBookId(Integer bookId);
}
