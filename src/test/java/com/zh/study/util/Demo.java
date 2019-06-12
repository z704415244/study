package com.zh.study.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibet.connect.factory.Connection;
import com.alibet.connect.factory.ConnectionFactory;
import com.google.gson.Gson;
import com.zh.study.bean.Goods;
import com.zh.study.bean.Info;
import com.zh.study.bean.User;
import org.junit.Test;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @Author yexun
 * @Date 2018/11/9
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println();
        Connection connection = ConnectionFactory.getInstance("http");
    }
}
