package com.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xiaoliu
 */
@Controller
public class ViewController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

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

    @RequestMapping("order_man")
    public String orderMan(){
        return "order_man";
    }

    @RequestMapping("order_create")
    public String orderCreate() {return "order_create";}

    @RequestMapping("statistics_month")
    public String statisticsMonth(){
        return "statistics_month";
    }

    @RequestMapping("statistics_repaire")
    public String statisticsRepair(){
        return "statistics_repaire";
    }

    @RequestMapping("user_man")
    public String userMan(){
        return "user_man";
    }

    @RequestMapping("user_notice")
    public String userNotice(){
        return "user_notice";
    }

    @RequestMapping("test_add_car")
    public String testAdd(){
        return "testJsp";
    }
}
