package com.atiguigu.ssm.mapper;

import com.atiguigu.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    //查询所有员工
    List<Employee> getAllEmployee();
}
