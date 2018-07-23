package com.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("police")
public class PoliceCarController {
    @RequestMapping("car_manager")
    public String car_info(){
        return "police/car_manager";
    }
}
