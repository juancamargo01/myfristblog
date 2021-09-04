package com.juancamargo.blog.myfristblog.service.serviceImpl;

import com.juancamargo.blog.myfristblog.model.Post;
import com.juancamargo.blog.myfristblog.repository.CodeblogRepository;
import com.juancamargo.blog.myfristblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CodeblogServiceImpl implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogRepository;

    @Override
    public List<Post> findAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
}
