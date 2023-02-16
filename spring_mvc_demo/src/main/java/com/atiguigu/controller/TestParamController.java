package com.atiguigu.controller;

import com.atiguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//将HttpServletRequest作为控制器方法的形参，此时HttpServletRequest类型的参数表示封装了当前请求的请求报文的对象
//获取请求参数
@Controller
public class TestParamController {
    @RequestMapping("/param/servletAPI")
    public String getParamController(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+"------"+password);
        return "success";
    }
    @RequestMapping("/param")
    public String getParam(
            @RequestParam("userName") String username,
            String password,
            @RequestHeader("referer") String referer,
            @CookieValue("JSESSIONID") String jsessionId
    ){
        System.out.println(username+"------"+password+"-------refer::"+referer+"------cookie::"+jsessionId);
        return "success";
    }
    //在控制器方法的形参位置，设置和请求参数同名的形参，
    // 当浏览器发送请求，匹配到请求映射时，在DispatcherServlet中就会将请求参数赋值给相应的形参
    //@RequestParam是将请求参数和控制器方法的形参创建映射关系
    // @RequestParam注解一共有三个属性：value：指定为形参赋值的请求参数的参数名
    //required：设置是否必须传输此请求参数，默认值为true
    //若设置为true时，则当前请求必须传输value所指定的请求参数，若没有传输该请求参数，且没有设置
    //defaultValue属性，则页面报错400：Required String parameter 'xxx' is not present；
    // 若设置为false，则当前请求不是必须传输value所指定的请求参数，若没有传输，则注解所标识的形参的值为null
    //defaultValue：不管required属性值为true或false，当value所指定的请求参数没有传输或传输的值为""时，则使用默认值为形参赋值

    @RequestMapping("/param/pojo")
    public String getParamByPOJO(User user){
        System.out.println(user);
        return "success";
    }
    //可以在控制器方法的形参位置设置一个实体类类型的形参，
    // 此时若浏览器传输的请求参数的参数名和实体类中的属性名一致，那么请求参数就会为此属性赋值

}
