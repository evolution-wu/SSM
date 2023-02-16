package com.atiguigu.mapper;

import com.atiguigu.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    Emp getEmpById(@Param("empId") Integer empId);

}
