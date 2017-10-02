package com.codingblocks.networkfetch;

/**
 * Created by harshit on 02/10/17.
 */

public class User {

    private String id,login,url,score;

    public User(String id, String login, String url, String score) {
        this.id = id;
        this.login = login;
        this.url = url;
        this.score = score;
    }


    public String getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getUrl() {
        return url;
    }

    public String getScore() {
        return score;
    }
}
