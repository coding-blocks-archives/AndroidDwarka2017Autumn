package com.codingblocks.fragments;

import java.util.ArrayList;

/**
 * Created by harshit on 16/09/17.
 */

public class Feed {

    String name,content,date;

    public Feed(String name, String content, String date) {
        this.name = name;
        this.content = content;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static ArrayList<Feed> getRandomList(){
        ArrayList<Feed> arrayList = new ArrayList<>();
        arrayList.add(new Feed("Harshit",
                "This is a demo content.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        arrayList.add(new Feed("Harshit",
                "This is a demo content2.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        arrayList.add(new Feed("Harshit",
                "This is a demo content3.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        arrayList.add(new Feed("Harshit",
                "This is a demo content4.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        arrayList.add(new Feed("Harshit",
                "This is a demo content5.\nMulti Lined content.\nMore Lines",
                "13-09-17"));
        return arrayList;
    }

}
