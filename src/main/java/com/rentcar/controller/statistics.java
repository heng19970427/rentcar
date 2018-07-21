package com.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class statistics {

    @RequestMapping("statistics_month")
    public String statistics_month(){
        return "statistics_month";
    }

    @RequestMapping("statistics_repaire")
    public String statistics_repaire(){
        return "statistics_repaire";
    }
}
