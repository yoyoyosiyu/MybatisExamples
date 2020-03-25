package com.huayutech.basic.rest;

import com.huayutech.basic.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @PostMapping
    public void onCreateUser() {
        userMapper.createUser(0L, "admin");
    }


}
