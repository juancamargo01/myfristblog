package com.juancamargo.blog.myfristblog.repository;

import com.juancamargo.blog.myfristblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CodeblogRepository extends JpaRepository<Post, Long> {
}
