package com.rentcar.controller;

import com.rentcar.pojo.User;
import com.rentcar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Xiaoliu
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("all_shop")
    public List<User> getAllUserShop(){
        return userService.getAllUserShop();
    }

}
