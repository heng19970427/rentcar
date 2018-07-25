package com.rentcar.pojo;

import java.util.Date;

public class Order {
    int orderId;
    Date rentDate;
    Date returnDate;
    Date returnDateReal;
    String status;
    double fee;
    double fuelRemain;
    Integer invoice;
    User user;
    Car car;
    DisCountPackage discountPackage;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

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
}
