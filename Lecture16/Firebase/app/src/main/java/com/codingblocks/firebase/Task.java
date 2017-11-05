package com.codingblocks.firebase;

/**
 * Created by harshit on 05/11/17.
 */

public class Task {

    long id;
    String title, desc;

    public Task() {
    }

    public Task(long id, String title, String desc) {
        this.id = id;
        this.title = title;
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
