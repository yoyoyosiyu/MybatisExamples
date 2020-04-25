package com.huayutech.basic.service.impl;

import com.huayutech.basic.service.IdGeneratedService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class IdGeneratedServiceImpl implements IdGeneratedService {
    @Override
    public Long generate() {
        Random random = new Random();
        return random.longs(90000000000L, 99999999999L)
                .findFirst().getAsLong();
    }
}
