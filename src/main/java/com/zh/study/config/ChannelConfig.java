package com.zh.study.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * @Author yexun
 * @Date 2019-03-01
 */
//@ConfigurationProperties(prefix = "hello")
@ConfigurationProperties(prefix = "channelConfig")

//@PropertySource("classpath:data.yml")
@Component
public class ChannelConfig {

    private List<Map<String, String>> channel;


    @Value("${id}")
    private Integer id;


    @PostConstruct
    public void init(){
        System.out.println(channel);
    }

    public Object getConfig(){
        return channel;
    }

    public Integer getId() {
        return id;
    }

    public ChannelConfig setId(Integer id) {
        this.id = id;
        return this;
    }
}
