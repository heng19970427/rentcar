package com.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class carservice {

    @RequestMapping("carservice_insurance")
    public String carservice_insurance(){
        return "carservice_insurance";
    }

    @RequestMapping("carservice_maintenance")
    public String carservice_maintenance(){
        return "carservice_maintenance";
    }

    @RequestMapping("carservice_peccancy")
    public String carservice_peccancy(){
        return "carservice_peccancy";
    }

    @RequestMapping("carservice_repair")
    public String carservice_repair(){
        return "carservice_repair";
    }
}
