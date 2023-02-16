package com.atiguigu.mapper;

import com.atiguigu.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    //查询功能是，一定要注意返回类型是单个还是集合类型返回
    User getUserById(@Param("id") Integer id);
    List<User> getAllUser();

    /**
     * 查询用户的总记录数
     * @return
     * 在MyBatis中，对于Java中常用的类型都设置了类型别名
     * 例如： java.lang.Integer-->int|integer
     * 例如： int-->_int|_integer
     * 例如： Map-->map,List-->list
     */
    Integer getCount();

    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    List<Map<String,Object> >getAllUserToMap();
    /**
     * 查询所有用户信息为map集合
     * @return
     * 将表中的数据以map集合的方式查询，一条数据对应一个map；若有多条数据，就会产生多个map集合，并
    且最终要以一个map的方式返回数据，此时需要通过@MapKey注解设置map集合的键，值是每条数据所对应的
    map集合
     */
    @MapKey("id")
    Map<String, Object> getAllUserToMap2();
}
