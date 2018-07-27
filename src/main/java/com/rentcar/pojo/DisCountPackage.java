package com.rentcar.pojo;

public class DisCountPackage {
    private int disCountPackageId;
    private double disCountFee;
    private int day;
    private User belong;

    public User getBelong() {
        return belong;
    }

    public void setBelong(User belong) {
        this.belong = belong;
    }

    public int getDisCountPackageId() {
        return disCountPackageId;
    }

    public void setDisCountPackageId(int disCountPackageId) {
        this.disCountPackageId = disCountPackageId;
    }

    public double getDisCountFee() {
        return disCountFee;
    }

    public void setDisCountFee(double disCountFee) {
        this.disCountFee = disCountFee;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
