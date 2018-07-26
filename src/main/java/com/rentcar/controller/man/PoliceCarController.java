package com.rentcar.controller.man;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zr
 */
@Controller
@RequestMapping("police")
public class PoliceCarController {
    @RequestMapping("car_manager")
    public String carInfo(){
        return "police/car_manager";
    }
}
