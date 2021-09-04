package com.juancamargo.blog.myfristblog.service;

import com.juancamargo.blog.myfristblog.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);

}
