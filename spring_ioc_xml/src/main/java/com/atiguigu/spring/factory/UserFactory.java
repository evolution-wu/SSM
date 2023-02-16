package com.atiguigu.spring.factory;

import com.atiguigu.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

public class UserFactory implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
