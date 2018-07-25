package com.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xiaoliu
 */
@Controller
public class OrderController {

    @RequestMapping("order_man")
    public String orderMan(){
        return "order_man";
    }

    @RequestMapping("order_create")
    public String orderCreate(){
        return "order_create";
    }
}
