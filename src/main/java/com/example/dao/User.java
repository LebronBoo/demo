package com.example.dao;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Data
@Alias("lbwnb")
public class User {
    private String id;
    private String username;
    private String pw;
    private Date createdate;
    private Integer age;
}
