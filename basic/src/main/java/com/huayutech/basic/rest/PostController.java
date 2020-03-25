package com.huayutech.basic.rest;

import com.huayutech.basic.mapper.PostMapper;
import com.huayutech.basic.presentation.PostPresent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostMapper postMapper;

    @PostMapping
    public void onCreatePost() {

        postMapper.createPost(1L, "Hello, world!");
    }

    @GetMapping
    public List<PostPresent> onGetAllPost() {
        return postMapper.getAllPost();
    }

}
