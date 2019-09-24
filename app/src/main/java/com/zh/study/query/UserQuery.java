package com.zh.study.query;

import java.util.Date;
import java.util.List;

/**
 * @Author yexun
 * @Date 2019-09-14
 */
public class UserQuery {

    private List<Integer> ids;

    private Date birthday;

    public List<Integer> getIds() {
        return ids;
    }

    public UserQuery setIds(List<Integer> ids) {
        this.ids = ids;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public UserQuery setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }
}
