package com.rentcar.controller;

import com.rentcar.pojo.Car;
import com.rentcar.service.CarManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("car")
public class CarController {
    @Autowired
    private CarManagerService carManagerService;

    @RequestMapping("all_car")
    @ResponseBody
    public List<Car> getAllCar(int userId){
        return carManagerService.getAllCar(userId);
    }

    public CarManagerService getCarManagerService() {
        return carManagerService;
    }

    public void setCarManagerService(CarManagerService carManagerService) {
        this.carManagerService = carManagerService;
    }
}
