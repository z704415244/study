package com.zh.study.dao;

import com.zh.study.StudyTestApplication;
import com.zh.study.model.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Author yexun
 * @Date 2019-08-21
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudyTestApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert(){

        User user = new User()
                .setName("Test")
                .setBirthday(new Date())
                .setGmtCreate(new Date());

        userMapper.insert(user);
    }

    @Test
    public void get(){
        User user = userMapper.selectById(51);
        System.out.println(user);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        System.out.println(sdf.format(user.getGmtCreate()));
    }

}