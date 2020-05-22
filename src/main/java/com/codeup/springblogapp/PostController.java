package com.codeup.springblogapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String viewPostsPage(){
        return "view posts";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String viewPost(@PathVariable int id){
        return "view post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createForm(){
        return "create form";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createFormSubmit(){
        return "submit create form";
    }


}