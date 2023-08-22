package com.example.mapper;


import com.example.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper {


    List<User> selectAll();

    User selectById(String id);

    int insert(User user);


}