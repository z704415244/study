package com.zh.study.controller;

import com.zh.study.model.bean.User;
import com.zh.study.dao.UserMapper;
import com.zh.study.query.UserQuery;
import com.zh.study.view.UserReq;
import com.zh.study.view.UserVO;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author yexun
 * @Date 2019-08-21
 */
@RestController
@RequestMapping("/user")
@Log4j2
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/add")
    public void addUser(@RequestBody UserReq user){
        userMapper.insert(toUser(user));
    }

    @GetMapping("/get/time")
    public String  getTime(Integer id){
        User user = userMapper.selectById(id);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(user.getGmtCreate());
    }

    @GetMapping("/get")
    public List<UserVO> getUsers(@RequestBody List<Integer> ids) {
        List<User> users = userMapper.selectUsers(new UserQuery()
                .setIds(ids));
        return users.stream().map(this::toUserVO).collect(Collectors.toList());
    }

    private User toUser(UserReq userReq){
        return new User()
                .setId(userReq.getId())
                .setName(userReq.getName())
                .setBirthday(userReq.getBirthday() == null ? new Date() : new Date(userReq.getBirthday()))
                .setGmtCreate(userReq.getGmtCreate() == null ? new Date() : new Date(userReq.getGmtCreate()));
    }

    private UserVO toUserVO(User user) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return new UserVO()
                .setId(user.getId())
                .setName(user.getName())
                .setGmtCreate(simpleDateFormat.format(user.getGmtCreate()))
                .setBirthday(simpleDateFormat.format(user.getBirthday()));
    }

}
