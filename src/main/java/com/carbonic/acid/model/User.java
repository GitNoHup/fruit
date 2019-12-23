package com.carbonic.acid.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String userName;

    private String password;

    private String authority;

    private String status;

    private String nickName;

    private String email;

    private String phone;

    private Date createTime;

    private Date modifyTime;

}