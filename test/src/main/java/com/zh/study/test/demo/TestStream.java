package com.zh.study.test.demo;

import com.zh.study.test.model.User;
import com.zh.study.test.utils.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用于测试java8 Stream 的效率
 *
 * @Author yexun
 * @Date 2019-09-11
 */
public class TestStream {

    private final static TestStream app = new TestStream();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++)
            app.testErgodic(3000000);
    }

    // 遍历数组，测试执行效率
    private void testErgodic(int size) {
        List<User> users = app.buildData(size);

        System.out.println("foreach:" + DateUtil.executionTime(() -> app.testForeach(users)));

        System.out.println("for:" + DateUtil.executionTime(() -> app.testFor(users)));

        System.out.println("iter:" + DateUtil.executionTime(() -> app.testIter(users)));

    }

    private void testFor(List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            users.get(i).setId(1);
        }
    }

    private void testIter(List<User> users) {
        for (User user : users) {
            user.setId(2);
        }
    }

    private void testForeach(List<User> users) {
        users.forEach(e -> {
            e.setId(3);
        });
    }

    private List<User> buildData(int size) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            User user = new User()
                    .setId(i)
                    .setName(i + "name")
                    .setPassword(i + "password")
                    .setBirthday(new Date());
            users.add(user);
        }
        return users;
    }

}
