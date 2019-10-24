package com.asiainfo.mybatis_demo.config.security;

import com.asiainfo.mybatis_demo.config.interceptor.AllInterceptor;
import com.asiainfo.mybatis_demo.config.interceptor.SignInSignUpInterceptor;
import com.asiainfo.mybatis_demo.config.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {


        registry.addInterceptor(new UserInterceptor())
                .addPathPatterns("/users/**")
                .excludePathPatterns();

        registry.addInterceptor(new SignInSignUpInterceptor())
                .addPathPatterns("/sign/**")
                .excludePathPatterns()
                .order(2);

        registry.addInterceptor(new AllInterceptor())
                .addPathPatterns("/**")
                .order(1);  // 最小的先开始拦截

    }
}
