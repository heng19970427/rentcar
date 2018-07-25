package com.rentcar.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class IDCard {
    private Integer IDCardId;
    private String name;
    private String sex;
    private String address;
    private String folk;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date birthday;
    private String IDNumber;
    private String agency;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date expireStart;
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date expireEnd;
    private String photo;

    @Override
    public String toString() {
        return "IDCard{" +
                "IDCardId=" + IDCardId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", folk='" + folk + '\'' +
                ", birthday=" + birthday +
                ", IDNumber='" + IDNumber + '\'' +
                ", agency='" + agency + '\'' +
                ", expireStart=" + expireStart +
                ", expireEnd=" + expireEnd +
                ", photo='" + photo + '\'' +
                '}';
    }

    public Integer getIDCardId() {
        return IDCardId;
    }

    public void setIDCardId(Integer IDCardId) {
        this.IDCardId = IDCardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFolk() {
        return folk;
    }

    public void setFolk(String folk) {
        this.folk = folk;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Date getExpireStart() {
        return expireStart;
    }

    public void setExpireStart(Date expireStart) {
        this.expireStart = expireStart;
    }

    public Date getExpireEnd() {
        return expireEnd;
    }

    public void setExpireEnd(Date expireEnd) {
        this.expireEnd = expireEnd;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
