package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@TableName("AppUser")

public class AppUser {
    @JsonProperty("Id");
    public Integer Id;
    
}