package com.rentcar.controller;

import com.rentcar.pojo.User;
import com.rentcar.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author Xiaoliu
 */
@Controller
public class ViewController {

    private static Logger logger = Logger.getLogger(ViewController.class);
    private static Integer POLICE_ROLE_ID = 1;
    private static Integer SHOP_ROLE_ID = 2;

    @Autowired
    UserService userService;

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String loginPage(){return "login";}

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ModelAndView login(@RequestParam("phone")String phone,
                              @RequestParam("password")String password,
                              ModelAndView mv,
                              HttpSession session){
        User user = userService.getUserByPhoneAndPassword(phone,password);
        if (user != null){
            mv.addObject("user",user);
            session.setAttribute("user",user);
            if (user.getRoleId().equals(SHOP_ROLE_ID)){
                mv.setViewName("index");
            }else if (user.getRoleId().equals(POLICE_ROLE_ID)){
                mv.setViewName("police/car_manage");
            }
        }else {
            mv.setViewName("login");
        }
        return mv;
    }

    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }

    @RequestMapping("car_info")
    public String carInfo(){
        return "car_info";
    }

    @RequestMapping("car_location")
    public String carLocation(){
        return "car_location";
    }

    @RequestMapping("car_fee")
    public String carFee(){
        return "car_fee";
    }

    @RequestMapping("car_fee_discount")
    public String carFeeDiscount(){
        return "car_fee_discount";
    }

    @RequestMapping("carservice_insurance")
    public String carServiceInsurance(){
        return "carservice_insurance";
    }

    @RequestMapping("carservice_maintenance")
    public String carServiceMaintenance(){
        return "carservice_maintenance";
    }

    @RequestMapping("carservice_peccancy")
    public String carServicePeccancy(){
        return "carservice_peccancy";
    }

    @RequestMapping("carservice_repair")
    public String carServiceRepair(){
        return "carservice_repair";
    }

    @RequestMapping("order_man")
    public String orderMan(){
        return "order_man";
    }

    @RequestMapping("order_create")
    public String orderCreate() {return "order_create";}

    @RequestMapping("statistics_month")
    public String statisticsMonth(){
        return "statistics_month";
    }

    @RequestMapping("statistics_repaire")
    public String statisticsRepair(){
        return "statistics_repaire";
    }

    @RequestMapping("user_man")
    public String userMan(){
        return "user_man";
    }

    @RequestMapping("user_notice")
    public String userNotice(){
        return "user_notice";
    }

    @RequestMapping("test_add_car")
    public String testAdd(){
        return "testJsp";
    }
}
