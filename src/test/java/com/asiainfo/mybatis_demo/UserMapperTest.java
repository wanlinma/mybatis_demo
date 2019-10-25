package com.asiainfo.mybatis_demo;

import com.asiainfo.mybatis_demo.entity.User;
import com.asiainfo.mybatis_demo.mapper.UserMapper;
import com.asiainfo.mybatis_demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class) //内部已经包含了spring容器
@SpringBootTest
public class UserMapperTest {
    @Autowired
    UserService userService;
    @Test
    public void findAll(){
        userService.findAllUser().forEach(x->System.out.println(x));
    }
}
