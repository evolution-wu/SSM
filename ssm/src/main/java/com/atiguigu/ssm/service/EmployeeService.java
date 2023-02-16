package com.atiguigu.ssm.service;

import com.atiguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {
    //查询所有员工信息
    List<Employee> getAllEmployee();

    //获取分页员工信息
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
