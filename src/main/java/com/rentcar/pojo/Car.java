package com.rentcar.pojo;

public class Car {
    private int carId;
    private String color;
    private String desc;
    private String carcol;
    private String fueltype;
    private String type;
    private String frameId;
    private String brand;
    private String img;
    private double rentfee;
    private double deposit;
    private double capacity;
    private double initfuel;
    private String status;
    User user;
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCarcol() {
        return carcol;
    }

    public void setCarcol(String carcol) {
        this.carcol = carcol;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrameId() {
        return frameId;
    }

    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getRentfee() {
        return rentfee;
    }

    public void setRentfee(double rentfee) {
        this.rentfee = rentfee;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getInitfuel() {
        return initfuel;
    }

    public void setInitfuel(double initfuel) {
        this.initfuel = initfuel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
