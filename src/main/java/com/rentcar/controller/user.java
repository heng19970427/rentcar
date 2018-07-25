package com.rentcar.controller;

import com.rentcar.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class user {

    @RequestMapping("user_man")
    public String user_man(){
        return "user_man";
    }

    @RequestMapping("user_notice")
    public String user_notice(){
        return "user_notice";
    }
}
