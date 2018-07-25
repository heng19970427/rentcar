package com.rentcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xiaoliu
 */
@Controller
public class UserController {

    @RequestMapping("user_man")
    public String userMan(){
        return "user_man";
    }

    @RequestMapping("user_notice")
    public String userNotice(){
        return "user_notice";
    }
}
