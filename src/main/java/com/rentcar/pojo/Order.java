package com.rentcar.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Order {
    int orderId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date rentDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date returnDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date returnDateReal;
    String phone;
    String status;
    double extraDerate;
    double fee;
    double fuelRemain;
    Integer invoice;
    User belong;
    User user;
    Car car;
    DisCountPackage discountPackage;

    public User getBelong() {
        return belong;
    }

    public void setBelong(User belong) {
        this.belong = belong;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getReturnDateReal() {
        return returnDateReal;
    }

    public void setReturnDateReal(Date returnDateReal) {
        this.returnDateReal = returnDateReal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFuelRemain() {
        return fuelRemain;
    }

    public void setFuelRemain(double fuelRemain) {
        this.fuelRemain = fuelRemain;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public DisCountPackage getDiscountPackage() {
        return discountPackage;
    }

    public void setDiscountPackage(DisCountPackage discountPackage) {
        this.discountPackage = discountPackage;
    }

    public double getExtraDerate() {
        return extraDerate;
    }

    public void setExtraDerate(double extraDerate) {
        this.extraDerate = extraDerate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
