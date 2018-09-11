package com.rentcar.pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-09-09
 */
public class Caroption {
    private Integer carOptionId;

    private String optionName;

    private String optionValue;

    private Integer carId;

    public Integer getCarOptionId() {
        return carOptionId;
    }

    public void setCarOptionId(Integer carOptionId) {
        this.carOptionId = carOptionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue == null ? null : optionValue.trim();
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }
}