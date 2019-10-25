package com.asiainfo.mybatis_demo.controller.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class AllExceptionControllerAdvice {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity defaultError(HttpServletRequest request, HttpServletResponse response) {
        // 这里可以进行错误判断，那种错误状态问题

        return ResponseEntity.status(404).body("页面为找到");
    }
}
