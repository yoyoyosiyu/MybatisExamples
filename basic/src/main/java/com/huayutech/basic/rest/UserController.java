package com.huayutech.basic.rest;

import com.huayutech.basic.mapper.PostMapper;
import com.huayutech.basic.mapper.UserMapper;
import com.huayutech.basic.presentation.PostPresent;
import com.huayutech.basic.presentation.UserPresent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    PostMapper postMapper;

    @PostMapping
    public void onCreateUser() {
        userMapper.createUser(0L, "admin");
    }


    @GetMapping("/{userId}/posts")
    public Collection<PostPresent> onGetPostsByUserId(@PathVariable Long userId) {

        return postMapper.getPostByUser(userId);


    }

    @GetMapping("/{userId}")
    public UserPresent onGetUser(@PathVariable Long userId) {
        return userMapper.getUser(userId);
    }

}
