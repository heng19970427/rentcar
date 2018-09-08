package com.rentcar.pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-09-08
 */
public class Police {
    /**
     * ¾¯¹ÙId
     */
    private Integer policeId;

    private String username;

    private String password;

    public Integer getPoliceId() {
        return policeId;
    }

    public void setPoliceId(Integer policeId) {
        this.policeId = policeId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}