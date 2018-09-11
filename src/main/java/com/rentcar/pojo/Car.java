package com.rentcar.pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-09-09
 */
public class Car {
    private Integer carId;

    private String plateNumber;

    private String color;

    private String desc;

    private String type;

    private String frameId;

    private String brand;

    private String img;

    private Float rentFee;

    /**
     * 押金
     */
    private Float deposit;

    private Float capacity;

    private Float initFuel;

    /**
     * 状态 "0" 未出租 "1" 已出租
     */
    private String status;

    private Integer belong;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber == null ? null : plateNumber.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getFrameId() {
        return frameId;
    }

    public void setFrameId(String frameId) {
        this.frameId = frameId == null ? null : frameId.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Float getRentFee() {
        return rentFee;
    }

    public void setRentFee(Float rentFee) {
        this.rentFee = rentFee;
    }

    public Float getDeposit() {
        return deposit;
    }

    public void setDeposit(Float deposit) {
        this.deposit = deposit;
    }

    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public Float getInitFuel() {
        return initFuel;
    }

    public void setInitFuel(Float initFuel) {
        this.initFuel = initFuel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getBelong() {
        return belong;
    }

    public void setBelong(Integer belong) {
        this.belong = belong;
    }
}