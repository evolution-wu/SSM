package com.atiguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestRestController {
    // 查询所有用户的信息/user------->/user-->get
    // 根据id查询用户的信息/user------->/user/1-->get
    // 新增用户的信息/user------->/user/1/admin/123-->post
    // 修改用户的信息/user------->/user-->put
    // 根据id删除用户的信息/user------->/user/1-->delete

    //浏览器只有get和post两种方式
    //若要实现put和delete请求，必须配置一个过滤器hiddenhttpmethodfliter在web.xml中
    //配置后，必须method视为post,然后传参数——method，后面为put或delete
    //@RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAlluser(){
        System.out.println(" 查询所有用户的信息/user------->/user-->get");
        return "success";
    }
    //@RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("根据id查询用户的信息/user------->/user/"+id+"-->get");
        return "success";
    }
    //@RequestMapping(value = "/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public String insertUser(){
        System.out.println("新增用户的信息/user------->/user/1/admin/123-->post");
        return "success";
    }

    //@RequestMapping(value = "/user",method = RequestMethod.PUT)
    @PutMapping("/user")
    public String updateUser(){
        System.out.println("修改用户的信息/user------->/user-->put");
        return "success";
    }
    //@RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println("根据id删除用户的信息/user------->/user/"+id+"-->delete");
        return "success";
    }
}
