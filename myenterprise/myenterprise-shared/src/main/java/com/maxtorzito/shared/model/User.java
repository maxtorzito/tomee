/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maxtorzito.resources.model;

/**
 *
 * @author maxtorzito
 */
public class User {

    private int id;
    private String userName;
    private String password;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }
    
    public User(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Id:"+id+", User name:"+userName+", Password:"+password;
    }
}