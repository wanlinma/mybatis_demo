package com.asiainfo.mybatis_demo.config.security;

import com.asiainfo.mybatis_demo.config.interceptor.SignInSignUpInterceptor;
import com.asiainfo.mybatis_demo.config.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigurer implements WebMvcConfigurer {

    /**
     * 视频，图片匹配
     *
     * @param registry 过滤图片，视频的访问
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/imgs/**").addResourceLocations("file:d:/");  // 处理静态资源  ,前端这么写就行 <img src="http://localhost:8080/imgs/1.png"/>   数据库存图片是需要记录图片位置
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new UserInterceptor())
                .addPathPatterns("/users/**")
                .excludePathPatterns()
                .order(1);

        registry.addInterceptor(new SignInSignUpInterceptor())
                .addPathPatterns("/sign/**")
                .excludePathPatterns()
                .order(2);


    }


}
