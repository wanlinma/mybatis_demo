package com.asiainfo.mybatis_demo.config.security;

import com.asiainfo.mybatis_demo.config.interceptor.AllInterceptor;
import com.asiainfo.mybatis_demo.config.interceptor.SignInSignUpInterceptor;
import com.asiainfo.mybatis_demo.config.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigurer implements WebMvcConfigurer {

    /**
     *  视频，图片匹配
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/imgs/**").addResourceLocations("file:D:/");  // 处理静态资源
    }



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
