package com.xoste.leon.pojo;

/**
 * @author Leon
 */
public class Users {
    private int id;
    private String username;
    private String password;
    private String images;

    public Users() {
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getImages() {
        return images;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
