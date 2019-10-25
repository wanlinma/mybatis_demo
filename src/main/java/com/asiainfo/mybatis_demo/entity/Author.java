package com.asiainfo.mybatis_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private Integer authorId;
    private String authorName;
    private List<Blog> blogs;
}
