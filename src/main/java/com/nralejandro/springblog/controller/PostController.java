package com.nralejandro.springblog.controller;


import com.nralejandro.springblog.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private IPostService iPostService;

    @GetMapping("/")
    public String showPostIndex (Model model){

        model.addAttribute("posts",iPostService.getPosts());

        System.out.println(iPostService.getPosts());

        return "/posts/posts.html";
    }



}
