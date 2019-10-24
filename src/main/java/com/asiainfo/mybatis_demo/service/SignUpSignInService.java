package com.asiainfo.mybatis_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class SignUpSignInService {

    @Value("${spring.mail.username}")
    private String from;
    @Autowired
    JavaMailSender mailSender;
    public void sendMail(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo("wanlin_ma@aliyun.com");
        message.setSubject("注册邮箱验证码：");
        message.setText("13456");
        mailSender.send(message);
    }

}
