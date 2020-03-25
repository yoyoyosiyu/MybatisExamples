package com.huayutech.basic.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("INSERT user (id, name) VALUES (#{id}, #{name})")
    public void createUser(Long id, String name);

}
