package com.rentcar.pojo.group;

import com.rentcar.pojo.Car;
import com.rentcar.pojo.Caroption;
import com.rentcar.pojo.Image;

import java.util.List;

public class CarGroup {
    private Car car;
    private List<Image> imageList;
    private List<Caroption> caroptionList;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public List<Caroption> getCaroptionList() {
        return caroptionList;
    }

    public void setCaroptionList(List<Caroption> caroptionList) {
        this.caroptionList = caroptionList;
    }
}
