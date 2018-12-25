package com.zh.study.bean;

/**
 * @Author yexun
 * @Date 2018-12-19
 */
public class User {
    private int id;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
