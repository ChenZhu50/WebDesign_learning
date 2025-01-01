package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AppUserDto;

import org.springframework.web.bind.annotation.RequestMethod;

/*
 * 用户的对外的控制器
 */

@RestController
@RequestMapping("/User")
public class AppUserController {
    
    //创建或者修改给一个appuser
    @RequestMapping(value = "/createOrEdit", method = RequestMethod.POST)
    public AppUserDto createOrEdit(@RequestBody AppUserDto input) {
        
    }
}
