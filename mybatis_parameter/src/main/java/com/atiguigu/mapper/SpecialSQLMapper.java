package com.atiguigu.mapper;

import com.atiguigu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSQLMapper {
    List<User> getUserByLike(@Param("mohu") String mohu);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteMore(@Param("ids") String ids);
    /**
     * 动态设置表名，查询所有的用户信息
     * @param tableName
     * @return
     */
    List<User> getAllUser(@Param("tableName") String tableName);
    /**
     * 添加用户信息
     * @param user
     * @return
     * useGeneratedKeys：设置使用自增的主键
     * keyProperty：因为增删改有统一的返回值是受影响的行数，因此只能将获取的自增的主键放在传输的参数user对象的某个属性中
     */
    int insertUser(User user);
}
