package com.zh.study.utils;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Author yexun
 * @Date 2019-09-25
 */
@Component("springBeanUtil")
@Log4j2
public class SpringBeanUtil implements ApplicationContextAware {

    private static ApplicationContext ctx = null;

    private static Map<String, Properties> propMap = new HashMap<String, Properties>(
            0);

    @Override
    public void setApplicationContext(ApplicationContext ctx)
            throws BeansException {
        SpringBeanUtil.ctx = ctx;
    }

    public ApplicationContext getApplicationContext() {
        return ctx;
    }

    public <T> T getBean(String prop) {
        Object obj = ctx.getBean(prop);
        if (log.isDebugEnabled()) {
            log.debug("property=[" + prop + "],object=[" + obj + "]");
        }
        return (T)obj;
    }

    public Properties getProperties(String filepath) {
        if (propMap.containsKey(filepath)) {
            return propMap.get(filepath);
        }

        Resource resource = ctx.getResource(filepath);
        Properties prop = new Properties();
        try {
            prop.load(resource.getInputStream());
            propMap.put(filepath, prop);
            return prop;
        } catch (IOException e) {
            log.error("can not find the resource file:[" + filepath + "]", e);
            return null;
        }
    }
}