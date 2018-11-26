package com.zh.study.util;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yexun
 * @Date 2018/11/9
 */
public class Demo {


    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "aa");
        String s = JSON.toJSON(map).toString();
        System.out.println(s);
        System.out.println(JSON.toJSONString(map));

    }


    static int add(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
