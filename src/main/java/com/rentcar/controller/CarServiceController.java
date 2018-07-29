package com.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xiaoliu
 */
@Controller
@RequestMapping("api_v1/carService")
public class CarServiceController {

    @RequestMapping("carservice_insurance")
    public String carServiceInsurance(){
        return "carservice_insurance";
    }

    @RequestMapping("carservice_maintenance")
    public String carServiceMaintenance(){
        return "carservice_maintenance";
    }

    @RequestMapping("carservice_peccancy")
    public String carServicePeccancy(){
        return "carservice_peccancy";
    }

    @RequestMapping("carservice_repair")
    public String carServiceRepair(){
        return "carservice_repair";
    }
}
