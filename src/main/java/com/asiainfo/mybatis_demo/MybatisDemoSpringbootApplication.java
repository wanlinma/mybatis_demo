package com.asiainfo.mybatis_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *  IdCard 和 User 用来测试 一对一。一个用户一个身份证号
 *  Author,BLog 用来测试 一对多，一个作者，多个博客
 *	Student,Course 用来测试 多对多。 一个学生有多门课程，多门
 */
@SpringBootApplication
@MapperScan("com.asiainfo.mybatis_demo.mapper")
public class MybatisDemoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDemoSpringbootApplication.class, args);
	}

}
