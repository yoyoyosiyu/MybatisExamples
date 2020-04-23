package com.huayutech.basic.rest;

import com.huayutech.basic.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/common")
public class CommonController {

    @Autowired
    CommonMapper commonMapper;

    @GetMapping("/server_time")
    public Date getServerTime() {

        return commonMapper.getCurrentTime();

    }

}
