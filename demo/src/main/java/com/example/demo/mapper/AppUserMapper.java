package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.entity.AppUser;

/*
 * baseMapper是MybatisPlus的基础类 封装了一些基础的增删改查方法 继承了BaseMapper
 * 
 * 现在我们就需要实现增删改查的方法
 * 
 */
@Mapper
public interface AppUserMapper extends BaseMapper<AppUser> {
    
    // Add your custom methods here
    
}
