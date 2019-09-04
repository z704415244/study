package com.zh.study.controller;

import com.zh.study.bean.User;
import com.zh.study.dao.UserMapper;
import com.zh.study.view.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Author yexun
 * @Date 2019-08-21
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/add")
    public void addUser(@RequestBody UserVO user){
        userMapper.insert(toUser(user));
    }

    @GetMapping("/get")
    public User getUser(Integer id){
        return userMapper.selectById(id);
    }

    private User toUser(UserVO userVO){
        return new User()
                .setId(userVO.getId())
                .setName(userVO.getName())
                .setBirthday(new Date(userVO.getBirthday()))
                .setGmtCreate(new Date(userVO.getGmtCreate()));
    }

}
