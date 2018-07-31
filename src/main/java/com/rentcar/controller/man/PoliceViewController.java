package com.rentcar.controller.man;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xiaoliu
 */
@Controller
@RequestMapping("police")
public class PoliceViewController {

    @RequestMapping("car_manage")
    public String carManage(){
        return "police/car_manage";
    }

    @RequestMapping("order_manage")
    public String orderManage() {
        return "police/order_manage";
    }

    @RequestMapping("user_manage")
    public String userManage() {
        return "police/user_manage";
    }
}
