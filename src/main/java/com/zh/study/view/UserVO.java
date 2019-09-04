package com.zh.study.view;

/**
 * @Author yexun
 * @Date 2019-08-23
 */
public class UserVO {
    private Integer id;

    private String name;

    private Long birthday;

    private Long gmtCreate;

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

    public Long getBirthday() {
        return birthday;
    }

    public UserVO setBirthday(Long birthday) {
        this.birthday = birthday;
        return this;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public UserVO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
}
