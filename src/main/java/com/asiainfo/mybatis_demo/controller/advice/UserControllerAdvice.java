package com.asiainfo.mybatis_demo.controller.advice;

import com.asiainfo.mybatis_demo.exception.UserPasswordNotMatchException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(value = UserPasswordNotMatchException.class)
    @ResponseBody
    public ResponseEntity userPasswordNotMathException(HttpServletRequest request, Exception e, HttpServletResponse response){
        return   ResponseEntity.ok().body("用户密码不匹配");
    }

}
