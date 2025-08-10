package com.example.demo.controller;

import com.example.demo.pojo.ResponseMessage;
import com.example.demo.pojo.User;
import com.example.demo.pojo.dto.UserDto;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController         //接口方法返回对象，转换成json文本
@RequestMapping("/user")      //加一级路由地址localhost:8080/user/***
public class UserController {
//    REST风格接口：根据客户端请求方式的不同做操作区分：get、post、put、delete
    @Autowired
    IUserService userService;
//    增加  @PostMapping
    @PostMapping        //url:localhost:8080/user
    public ResponseMessage<User> add(@Validated @RequestBody UserDto user){
       User userNew = userService.add(user);
        return ResponseMessage.success(userNew);
    }
//    查询
    @GetMapping("/{id}")
    public ResponseMessage get(@PathVariable Integer id){
        User newUser = userService.getUser(id);
        return ResponseMessage.success(newUser);
    }
//    修改
    @PutMapping
    public ResponseMessage<User> edit(@Validated @RequestBody UserDto user){
        User userNew = userService.edit(user);
        return ResponseMessage.success(userNew);
    }
//    删除用户
    @DeleteMapping("/{id}")
    public ResponseMessage delete(@PathVariable Integer id){
        userService.delete(id);
        return ResponseMessage.success(null);
    }
}
