package com.atiguigu.controller;

import com.atiguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.filter.HiddenHttpMethodFilter;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Controller
public class TestAjaxController {
  @RequestMapping("/test/ajax")
    public void testAjax(Integer id, @RequestBody String resquestBody, HttpServletResponse httpServletResponse) throws IOException {
    System.out.println("resquestBody： "+resquestBody);
    //@RequestBody可以获取请求体信息，
    // 使用@RequestBody注解标识控制器方法的形参，当前请求的请求体就会为当前注解所标识的形参赋值
    System.out.println("id："+id);
    httpServletResponse.getWriter().write("hello,axios");
  }

  @RequestMapping("/test/RequestBody/json")
  public void testResquestBody(@RequestBody User user, HttpServletResponse httpServletResponse) throws IOException {
    //使用@ResquestBody注解将json格式请求参数转化为Java对象
    //导入json的依赖，在SpringMVC的配置文件中设置<mvc:annotation-driven/>
    //在处理请求的控制器方法的形参位置，直接设置json格式的请求参数要转换的Java类型的形参
    //使用@ResquestBody注解标识即可
    System.out.println(user);
    httpServletResponse.getWriter().write("hello,RequestBody");
  }
  @RequestMapping("/test/ResponseBody")
  @ResponseBody
  //@ResponseBody:将所标识的控制器方法的返回值作为响应报文的响应体响应到浏览器
  //使用@ResponseBody注解响应浏览器json格式的数据
  //将需要转换为json字符串的java对象直接作为控制方法的返回值，使用@ResponseBody注解标识控制器方法，
  // 就可以将Java对象直接转化为json字符串，并响应到浏览器
  public String testResponseBody(){
    return "success";
  }

  @RequestMapping("/test/ResponseBody/json")
  @ResponseBody
  /*public User TestResponseBody(){
        User user = new User(1001,"admin","123456",23,"男");
        return user;
  }*/
  /*public Map<String,Object> TestResponseBody(){
    User user1 = new User(1001,"admin1","123",21,"男");
    User user2 = new User(1002,"admin2","456",22,"女");
    User user3 = new User(1003,"admin2","123456",23,"男");
    Map<String,Object> map = new HashMap<>();
    map.put("1001",user1);
    map.put("1002",user2);
    map.put("1003",user3);
    return map;
  }*/
  public List<User> TestResponseBody() {
    User user1 = new User(1001, "admin1", "123", 21, "男");
    User user2 = new User(1002, "admin2", "456", 22, "女");
    User user3 = new User(1003, "admin2", "123456", 23, "男");
    List<User> users = Arrays.asList(user1, user2, user3);
    return users;
  }
}
