package com.rentcar.pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-09-06
 */
public class Leaseholder {
    /**
     * �⳵��Id
     */
    private Integer leaseholderid;

    private Integer idcardid;

    /**
     * �˺�״̬ "0" δ��� "1" ��� 
     */
    private String status;

    private String username;

    private String password;

    public Integer getLeaseholderid() {
        return leaseholderid;
    }

    public void setLeaseholderid(Integer leaseholderid) {
        this.leaseholderid = leaseholderid;
    }

    public Integer getIdcardid() {
        return idcardid;
    }

    public void setIdcardid(Integer idcardid) {
        this.idcardid = idcardid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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