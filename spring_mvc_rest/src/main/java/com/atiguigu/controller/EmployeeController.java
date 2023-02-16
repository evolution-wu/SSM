package com.atiguigu.controller;

import com.atiguigu.dao.EmplyoeeDao;
import com.atiguigu.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
import java.util.Map;

@Controller
// 查询所有员工的信息/Employee------->/Employee-->get
//跳转到添加页面  /to/add/ ---》get
// 根据id查询员工的信息/Employee------->/Employee/1-->get
// 新增员工的信息/Employee------->/Employee-->post
// 修改员工的信息/Employee------->/Employee-->put
//跳转到修改页面 /employee/1-->get
// 根据id删除员工的信息/Employee------->/Employee/1-->delete
public class EmployeeController {
    @Autowired
    private EmplyoeeDao emplyoeeDao;
    @RequestMapping(value = "/employee" ,method = RequestMethod.GET)
    public String getALLEmployee(Model model){
        //获取所有的员工信息
        Collection<Employee> employees = emplyoeeDao.getAll();
        //将所有的员工信息在请求域中共享
        model.addAttribute("employees",employees);
        //跳转到页表页面
        return "employee_list";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
        //添加员工信息
        emplyoeeDao.save(employee);
        //重定向到页表功能：/employee
        return "redirect:/employee";
    }
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public String toupdate(@PathVariable("id") Integer id, Model model){
        //根据id查询员工信息
        Employee employee = emplyoeeDao.get(id);
        //将员工信息共享到请求域中
        model.addAttribute("employee",employee);
        //跳转到employee_update.html
        return "employee_update";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public String updateEmployee(Employee employee){
        //修改员工信息
        emplyoeeDao.save(employee);
        //重定向到页表功能：/employee
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id){
        //删除员工信息
        emplyoeeDao.delete(id);
        //重定向到页表功能：/employee
        return "redirect:/employee";
    }
}
