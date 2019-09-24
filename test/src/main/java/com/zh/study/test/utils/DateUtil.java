package com.zh.study.test.utils;

/**
 * @Author yexun
 * @Date 2019-09-15
 */
public class DateUtil {

    public static long executionTime(Actuator actuator) {
        long begin = System.currentTimeMillis();
        try {
            actuator.execute();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        return end - begin;
    }

    @FunctionalInterface
    public interface Actuator {

        void execute();

    }
}
