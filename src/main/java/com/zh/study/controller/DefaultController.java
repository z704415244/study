package com.zh.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Contended;

/**
 * @Author yexun
 * @Date 2018/11/9
 */
@RestController
@RequestMapping("/default")
public class DefaultController {

    private static final Logger logger = LoggerFactory.getLogger(DefaultController.class);

    @RequestMapping("/send")
    public void send(@RequestParam String name, @RequestParam String password){
        logger.info("receive message success, name={}, password={}", name, password);
    }

}
