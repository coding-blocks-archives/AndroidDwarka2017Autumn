package com.codingblocks.tododb;

/**
 * Created by harshit on 04/11/17.
 */

public class Todo {
    private int id;
    private String title;
    private String description;


    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Todo(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
