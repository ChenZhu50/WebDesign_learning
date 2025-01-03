package com.example.demo.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
/*
 * 用户表
 */

@Data
@TableName("AppUser")

public class AppUser {

    /**
     * 用户ID
     */
    @JsonProperty("UserName")
    private String UserName;
    /**
     * 密码
     */
    @JsonProperty("Password")
    private String Password;

    /**
     * 邮箱
     */
    @JsonProperty("Email")
    private String Email;
    /**
     * 头像
     */
    @JsonProperty("ImageUrls")
    private String ImageUrls;
    /**
     * 名称
     */
    @JsonProperty("Name")
    private String Name;
    /**
     * 手机号码
     */
    @JsonProperty("PhoneNumber")
    private String PhoneNumber;
    /**
     * 出生年月
     */
    @JsonProperty("Birth")
    private LocalDateTime Birth;

    /**
     * 用户角色
     */
    @JsonProperty("RoleType")
    private Integer RoleType;

}