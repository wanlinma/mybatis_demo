package com.asiainfo.mybatis_demo.controller;

import com.asiainfo.mybatis_demo.entity.Blog;
import com.asiainfo.mybatis_demo.service.BlogService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("add")
    public ResponseEntity add(@RequestBody Blog bLog)
    {
        return ResponseEntity.ok().body(blogService.addBlog(bLog));
    }
}
