package com.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class order {

    @RequestMapping("order_man")
    public String order_man(){
        return "order_man";
    }

    @RequestMapping("order_create")
    public String order_create(){
        return "order_create";
    }
}
