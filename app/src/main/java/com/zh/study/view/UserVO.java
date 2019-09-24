package com.zh.study.view;

/**
 * @Author yexun
 * @Date 2019-09-15
 */
public class UserVO {

    private Integer id;

    private String name;

    private String birthday;

    private String gmtCreate;

    public Integer getId() {
        return id;
    }

    public UserVO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserVO setName(String name) {
        this.name = name;
        return this;
    }

    public String getBirthday() {
        return birthday;
    }

    public UserVO setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public UserVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
}
