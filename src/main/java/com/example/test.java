package com.example;

import com.example.mapper.UserMapper;
import com.example.tools.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class test {
    public static void main(String[] args) {
//        try(SqlSession session = MybatisUtil.getSession(true)){
//            UserMapper userMapper = session.getMapper(UserMapper.class);
//            userMapper.selectAll().forEach(System.out::println);
//        }
        String a = "ZF01";
        if (!a.equals("ZF01") && !a.equals("ZF00")){
            System.out.println("ZF01");
        }else {
            System.out.println("ZF00");
        }
    }
}
