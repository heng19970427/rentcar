package com.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xiaoliu
 */
@Controller
public class StatisticsController {

    @RequestMapping("statistics_month")
    public String statisticsMonth(){
        return "statistics_month";
    }

    @RequestMapping("statistics_repaire")
    public String statisticsRepair(){
        return "statistics_repaire";
    }
}
