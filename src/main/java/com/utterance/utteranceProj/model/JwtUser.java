package com.utterance.utteranceProj.model;

public class JwtUser {

    private String userId;
    private String userName;
    private String role;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(String userId) {
        this.userId = userId;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getRole() {
        return role;
    }
}
