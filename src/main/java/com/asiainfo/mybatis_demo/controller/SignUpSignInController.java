package com.asiainfo.mybatis_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sign")
public class SignUpSignInController {

    @GetMapping("in")
    public void in(){
        System.out.println("登录");
    }
    @GetMapping("up")
    public void up(){
        System.out.println("注册");
    }
}
