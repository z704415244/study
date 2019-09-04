package com.zh.study.dao;

import com.zh.study.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteById(Integer id);

    int insert(User record);
    
    User selectById(Integer id);

    int updateBy(User record);
}