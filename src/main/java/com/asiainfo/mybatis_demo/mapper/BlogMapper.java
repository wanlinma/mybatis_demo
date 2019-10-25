package com.asiainfo.mybatis_demo.mapper;

import com.asiainfo.mybatis_demo.entity.Blog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface BlogMapper {
    // 根据 根据作者 id，去添加 博客
     Integer addBlog(@Param("blog") Blog blog);
}
