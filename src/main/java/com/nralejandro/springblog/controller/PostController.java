package com.nralejandro.springblog.controller;


import com.nralejandro.springblog.model.PostModel;
import com.nralejandro.springblog.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private IPostService iPostService;

    @GetMapping("/")
    public String showPostIndex (Model model){
        model.addAttribute("posts",iPostService.getPosts());
        return "/posts/posts.html";
    }

    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable(value="id") long id){
        iPostService.deletePost(id);
        return "redirect:/posts/";
    }

    @GetMapping("/create")
    public String showCreatePost(Model model){
        model.addAttribute("postModel", new PostModel());
        return "/posts/createPost.html";
    }

    @PostMapping("/create")
    public String createPost(@ModelAttribute PostModel postModel){
        iPostService.savePost(postModel);
        return "redirect:/posts/";
    }

    @GetMapping("/update/{id}")
    public String showUpdatePost(@PathVariable(value="id") long id, Model model){
        model.addAttribute("postModel", iPostService.getPostById(id));
        return "/posts/createPost.html";
    }

}












