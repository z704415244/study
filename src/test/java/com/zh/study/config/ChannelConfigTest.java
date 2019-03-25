package com.zh.study.config;

import com.zh.study.StudyApplication;
import com.zh.study.StudyApplicationTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author yexun
 * @Date 2019-03-01
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudyApplicationTests.class)
public class ChannelConfigTest {


    @Autowired
    private ChannelConfig channelConfig;

    @Test
    public void demo(){
        System.out.println(channelConfig.getConfig());
        System.out.println(channelConfig.getId());
    }

}
