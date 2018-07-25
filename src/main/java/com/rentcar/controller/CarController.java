package com.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
    @RequestMapping("car_info")
    public String carInfo(){
        return "car_info";
    }

    @RequestMapping("car_location")
    public String car_location(){
        return "car_location";
    }

    @RequestMapping("car_fee")
    public String car_fee(){
        return "car_fee";
    }

    @RequestMapping("car_fee_discount")
    public String car_fee_discount(){
        return "car_fee_discount";
    }
}
