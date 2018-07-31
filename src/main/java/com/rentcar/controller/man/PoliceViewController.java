package com.rentcar.controller.man;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xiaoliu
 */
@Controller
@RequestMapping("police")
public class PoliceViewController {

    @RequestMapping("car_manager")
    public String carInfo(){
        return "police/car_manager";
    }
}
