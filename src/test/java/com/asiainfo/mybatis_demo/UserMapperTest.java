package com.asiainfo.mybatis_demo;

import com.asiainfo.mybatis_demo.entity.User;
import com.asiainfo.mybatis_demo.mapper.UserMapper;
import com.asiainfo.mybatis_demo.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    UserService userService;
    @Test
    public void findAll(){
//        userService.findAllUser().forEach(x->System.out.println(x));
    }
}
