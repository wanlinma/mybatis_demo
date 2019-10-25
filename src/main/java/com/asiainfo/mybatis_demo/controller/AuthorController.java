package com.asiainfo.mybatis_demo.controller;

import com.asiainfo.mybatis_demo.entity.Author;
import com.asiainfo.mybatis_demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("add")
    public ResponseEntity add(@RequestBody Author author)
    {
        authorService.addAuthor(author);
        Integer authorId = author.getAuthorId();
        return ResponseEntity.ok().build();
    }

    // 一对多，查询，查询作者的多篇博客
    @GetMapping("all_blog")
    public ResponseEntity getAllBlog(@RequestBody Author author){
        return ResponseEntity.ok().body(authorService.getAllBlogsOfAuthor(author));
    }






}
