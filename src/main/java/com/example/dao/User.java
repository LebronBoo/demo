package com.example.dao;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String id;
    private String username;
    private String pw;
    private Date createdate;
    private Integer age;
}
