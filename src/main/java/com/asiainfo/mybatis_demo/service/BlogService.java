package com.asiainfo.mybatis_demo.service;

import com.asiainfo.mybatis_demo.entity.Blog;
import com.asiainfo.mybatis_demo.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements BlogMapper {
    @Autowired
    private BlogMapper bLogMapper;
    @Override
    public Integer addBlog(Blog blog) {
        return  bLogMapper.addBlog(blog);
    }
}
