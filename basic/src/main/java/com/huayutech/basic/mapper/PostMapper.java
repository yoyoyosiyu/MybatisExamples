package com.huayutech.basic.mapper;

import com.huayutech.basic.presentation.PostPresent;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostMapper {



    @Insert("INSERT post (id, title) values (#{id}, #{title})")
    void createPost(Long id, String title);

    @Results( value = {
            @Result(property = "user.name", column = "username")
    })
    @Select("SELECT title, user.name as username FROM post left join user on post.user_id = user.id")
    List<PostPresent> getAllPost();
}
