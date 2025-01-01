package com.example.demo.service.impl;

import org.springframework.web.bind.annotation.RequestBody;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dto.AppUserDto;
import com.example.demo.entity.AppUser;
import com.example.demo.mapper.AppUserMapper;
import com.example.demo.service.AppUserService;

/**
 * 用户表接口的具体实现
 */

public class AppUserServiceImpl extends ServiceImpl<AppUserMapper, AppUser> implements AppUserService {
    
    public AppUserDto createOrEdit(AppUserDto input) {
        // Implement your logic here
        return new AppUserDto();
    }
    
}
