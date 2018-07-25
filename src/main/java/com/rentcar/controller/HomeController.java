package com.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xiaoliu
 */
@Controller
public class HomeController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
