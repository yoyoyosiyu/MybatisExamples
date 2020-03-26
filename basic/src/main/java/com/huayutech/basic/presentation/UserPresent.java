package com.huayutech.basic.presentation;

import lombok.Data;

import java.util.List;

@Data
public class UserPresent {

    Long id;

    String name;

    List<PostPresent> posts;

}
