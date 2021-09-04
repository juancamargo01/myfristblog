package com.juancamargo.blog.myfristblog.controller;


import com.juancamargo.blog.myfristblog.model.Post;
import com.juancamargo.blog.myfristblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CodeblogController {


    @Autowired
    CodeblogService codeblogService;

    @RequestMapping(value = "posts", method = RequestMethod.GET)
    public ModelAndView getPost(){
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = codeblogService.findAll();
        mv.addObject("posts",posts);
        return mv;
    }
}