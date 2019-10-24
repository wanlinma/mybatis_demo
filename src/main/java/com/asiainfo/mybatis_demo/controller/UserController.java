package com.asiainfo.mybatis_demo.controller;

import com.asiainfo.mybatis_demo.entity.User;
import com.asiainfo.mybatis_demo.exception.UserPasswordNotMatchException;
import com.asiainfo.mybatis_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("all")
    public ResponseEntity getAllUsers(){
        System.out.println("新添加");
        return ResponseEntity.ok().build();
    }
    @GetMapping("one/{userId}")
    public ResponseEntity getUserById(@PathVariable("userId") Integer userId){
        List<User> user = userService.findUserById(userId);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/login")
    public void login(){
        throw new UserPasswordNotMatchException();
    }

    @PostMapping("error")
    public ResponseEntity error(){
        return ResponseEntity.ok().body("用户密码不匹配");
    }




}
