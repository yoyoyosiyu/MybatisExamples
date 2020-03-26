package com.huayutech.basic.mapper;

import com.huayutech.basic.presentation.UserPresent;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("INSERT user (id, name) VALUES (#{id}, #{name})")
    public void createUser(Long id, String name);

    @Select("SELECT * FROM user where id = #{id}")
    @Results(
            @Result(property = "posts", javaType = List.class, column = "id",
            many=@Many(select = "com.huayutech.basic.mapper.PostMapper.getPostByUser"))
    )
    public UserPresent getUser(Long id);

}
