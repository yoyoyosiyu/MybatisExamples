package com.huayutech.basic.mapper;

import com.huayutech.basic.presentation.PostPresent;
import com.huayutech.basic.presentation.UserPresent;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostMapper {



    @Insert("INSERT post (id, title, content) values (#{id}, #{title}, #{content})")
    void createPost(Long id, String title, String content);

    @Results( value = {
            @Result(property = "user.name", column = "username"),
            @Result(property = "user.id", column =  "userId")
    })
    @Select("SELECT title, user.name as username, user.id as userId FROM post left join user on post.user_id = user.id")
    List<PostPresent> getAllPost();

    @Select("SELECT post.*, user.name FROM post LEFT JOIN user on post.user_id = user.id where user_id = #{id}")
    @Results(
            @Result(property = "poster.name", column = "name")
    )
    List<PostPresent> getPostByUser(Long id);
}
