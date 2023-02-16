package com.atiguigu.mapper;

import com.atiguigu.pojo.Emp;

import java.util.List;

public interface DynamicSQLMapper {
     List<Emp> getEmpByCondition(Emp emp);
}
