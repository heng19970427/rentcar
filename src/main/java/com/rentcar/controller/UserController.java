package com.rentcar.controller;

import com.rentcar.pojo.User;
import com.rentcar.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("police")
public class UserController {
    private static Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @RequestMapping("getUserByRoleId")
    @ResponseBody
    public List<User> getUserByRoleId(@RequestParam("roleId") int roleId){
        List<User> users = userService.getUserByRoleId(roleId);
        logger.info(users.toString());
        return users;
    }
}
