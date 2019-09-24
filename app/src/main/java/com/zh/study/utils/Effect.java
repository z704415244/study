package com.zh.study.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author yexun
 * @Date 2019-03-25
 */
public class Effect {

    public static void main(String[] args) {

        System.out.println("亿万年+江山：" + calculate(377, 42, 35, 32, 50, 82, 18, 39, 18, 10, 18, 20, 10, 45));
        System.out.println("亿万年+黑洞：" + calculate(323, 22, 35, 51, 69, 82, 20, 41, 20, 18, 20, 10, 45));
        System.out.println("苍穹之云+江山：" + calculate(337, 63, 0, 46, 87, 82, 48, 18, 18, 10, 20, 20, 10, 45));
        System.out.println("苍穹之云+黑洞：" + calculate(283, 43, 0, 65, 106, 82, 50, 20, 20, 20, 20, 10, 45));
        System.out.println("亿万年：" + calculate(40, 0, 35, 20, 20, 25, 0, 21, 18));
        System.out.println("苍穹之云：" + calculate(0, 21, 0, 34, 21, 25, 30, 0, 20));


        System.out.println((1.05 + 0.0045 * 337));


    }

    private static double calculate(double properties, double white, double propertiesWhite, double yellow, double crit, double finalEffect, double attack, double power, double... skill) {
        double basePower = 3600.0;

        double totalSkill = 1;
        for (double v : skill) {
            totalSkill *= 1 + v / 100;
        }
        return (1 + white / 100 + propertiesWhite / 100 * (1.05 + 0.0045 * properties))
                * (1 + yellow / 100)
                * (1 + crit / 100)
                * (1 + finalEffect / 100)
                * (1 + attack / 100)
                * (1 + power / (100 + 25000 / basePower))
                * totalSkill
                * (1.05 + 0.0045 * properties)
                * 1.5;

    }

//    double properties = 377; // 属性强化
//        double white = 42; // 白字
//        double propertiesWhite = 35; // 属性白字
//        double yellow = 32; // 黄字
//        double crit = 50; // 爆伤
//        double finalEffect = 82; // 最终
//        double attack = 18; // 三攻
//        double power = 39; // 力智
//        double basePower = 3600; // 角色力量/智力
//        List<Integer> skill = Arrays.asList(18, 10, 18, 20, 10, 45); // 技能攻击

}
