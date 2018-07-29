package com.rentcar.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Xiaoliu
 */
public class IdCard {
    private Integer idCardId;
    private String name;
    private String sex;
    private String address;
    private String folk;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String idNumber;
    private String agency;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expireStart;
    private String expireEnd;
    private String photo;

    @Override
    public String toString() {
        return "IdCard{" +
                "idCardId=" + idCardId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", folk='" + folk + '\'' +
                ", birthday=" + birthday +
                ", idNumber='" + idNumber + '\'' +
                ", agency='" + agency + '\'' +
                ", expireStart=" + expireStart +
                ", expireEnd=" + expireEnd +
                ", photo='" + photo + '\'' +
                '}';
    }

    public Integer getIdCardId() {
        return idCardId;
    }

    public void setIdCardId(Integer idCardId) {
        this.idCardId = idCardId;
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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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

    public String getExpireEnd() {
        return expireEnd;
    }

    public void setExpireEnd(String expireEnd) {
        this.expireEnd = expireEnd;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
