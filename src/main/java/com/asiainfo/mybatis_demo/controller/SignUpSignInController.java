package com.asiainfo.mybatis_demo.controller;

import com.asiainfo.mybatis_demo.service.SignUpSignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("sign")
public class SignUpSignInController {

    @GetMapping("in")
    public void in(){
        System.out.println("登录");
    }
    @Autowired
    private SignUpSignInService signUpSignInService;
    @GetMapping("up")
    public void up(HttpServletResponse response) {
        System.out.println("注册");
        signUpSignInService.sendMail();
        response.setHeader("authentication", "yes");
    }
}
