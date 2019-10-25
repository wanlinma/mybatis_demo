package com.asiainfo.mybatis_demo;

import com.asiainfo.mybatis_demo.entity.Author;
import com.asiainfo.mybatis_demo.mapper.AuthorMapper;
import com.asiainfo.mybatis_demo.service.AuthorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class) //内部已经包含了spring容器
@SpringBootTest
public class AuthorMapperTest {
//    @Autowired
//    AuthorService authorService;

    @Autowired
    AuthorMapper authorMapper;
    @Test
    public void addAuthor(){
        Author author = new Author();
        author.setAuthorName("李白");
        authorMapper.addAuthor(author);
    }
}
