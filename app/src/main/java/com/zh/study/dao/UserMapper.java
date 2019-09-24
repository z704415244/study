package com.zh.study.dao;

import com.zh.study.model.bean.User;
import com.zh.study.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteById(Integer id);

    int insert(User record);
    
    User selectById(Integer id);

    int updateBy(User record);

    List<User> selectUsers(UserQuery query);
}