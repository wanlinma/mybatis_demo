package com.asiainfo.mybatis_demo.service;

import com.asiainfo.mybatis_demo.entity.Author;
import com.asiainfo.mybatis_demo.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService implements AuthorMapper {

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public Integer addAuthor(Author author) {
        return authorMapper.addAuthor(author);
    }

    @Override
    public Author getAllBlogsOfAuthor(Author author) {
       return authorMapper.getAllBlogsOfAuthor(author);
    }
}
