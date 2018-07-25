package com.rentcar.controller;

import com.rentcar.pojo.Car;
import com.rentcar.service.CarManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zr
 */
@Controller
public class CarController {
    @Autowired
    private CarManagerService carManagerService;

    @RequestMapping("car_info")
    public String carInfo(){
        return "car_info";
    }

    @RequestMapping("car_location")
    public String carLocation(){
        return "car_location";
    }

    @RequestMapping("car_fee")
    public String carFee(){
        return "car_fee";
    }

    @RequestMapping("car_fee_discount")
    public String carFeeDiscount(){
        return "car_fee_discount";
    }

    @RequestMapping("all_car")
    @ResponseBody
    public List<Car> getAllCar(int userId){
        return carManagerService.getAllCar(userId);
    }

}
