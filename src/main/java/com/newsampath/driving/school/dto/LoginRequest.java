package com.newsampath.driving.school.dto;

public class LoginRequest {
    private String userName;
    private String password;

    public String getUsername()
    {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
