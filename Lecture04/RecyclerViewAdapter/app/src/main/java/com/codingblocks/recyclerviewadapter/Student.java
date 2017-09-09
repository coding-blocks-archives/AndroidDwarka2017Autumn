package com.codingblocks.recyclerviewadapter;

/**
 * Created by harshit on 09/09/17.
 */

public class Student {

    private String name, course, center;

    public Student(String name, String course, String center) {
        this.name = name;
        this.course = course;
        this.center = center;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }
}
