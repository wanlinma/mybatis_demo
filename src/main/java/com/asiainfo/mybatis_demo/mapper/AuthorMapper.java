package com.asiainfo.mybatis_demo.mapper;

import com.asiainfo.mybatis_demo.entity.Author;
import com.asiainfo.mybatis_demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AuthorMapper {
    // 一对一，添加 作着，和其博客。// 分两步，第一步：添加作者，返回自增id。第二步：自增id，插入博客。
    Integer addAuthor(@Param("author")Author author);

    Author getAllBlogsOfAuthor(@Param("author")Author author);
}
