package com.rentcar.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rentcar.pojo.*;
import com.rentcar.service.IdCardService;
import com.rentcar.service.OrderService;
import com.rentcar.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Xiaoliu
 */
@Controller
@RequestMapping("api_v1/order")
public class OrderController {
    private static Logger logger = Logger.getLogger(OrderController.class);
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;
    @Autowired
    private IdCardService idCardService;
    @RequestMapping("order_man")
    public String orderMan(){
        return "order_man";
    }

    @RequestMapping("create_order")
    @ResponseBody
    @CrossOrigin(origins="*") //允许跨域
    public Response createOrder(OrderForm orderForm){
        logger.info("------createOrder start------");

        Response response=new Response();
        if(orderForm==null){
            response.setCode(1);
            response.setMsg("订单信息为空");
            return response;
        }
        IdCard idCard=orderForm.getIdCard();
        if(idCard==null){
            //user!=null
            logger.debug("在线下单,userId:"+orderForm.getUser());
            orderForm.setStatus("未提车");
        }
        else {
            logger.debug("线下租车");
            orderForm.setStatus("出租中");
            idCardService.addIdcardInfo(idCard);
            //线下租车 user==null
            User user=userService.getUserByPhone(orderForm.getPhone());
            if(user==null){
                user=new User();
                logger.debug("线下租车,用户未注册:"+idCard.toString());
                user.setIdCard(idCard);
                user.setPhone(orderForm.getPhone());
                userService.addUser(user);
            }else{
                orderForm.setUser(user);
            }
            idCardService.addIdcardInfo(idCard);
        }
        orderService.createOrder(orderForm);
        logger.info("------createOrder end------");
        response.setCode(0);
        response.setMsg("订单创建成功");
        return response;
    }

    @RequestMapping("test_create_order")
    public String testCreateOrder(){
        return "testOrder";
    }

    //商家修改订单
    /*
        两次修改订单:
        1.提车的时候
            上传身份证信息，userId为空，创建用户
        2.还车的时候
            修改订单状态，押金扣除
     */
    @RequestMapping("alter_order")
    @ResponseBody
    public String alterOrder(OrderForm orderForm){
        logger.debug("线上租车，提车");
        IdCard idCard = orderForm.getIdCard();
        orderService.alterOrder(orderForm);
        idCardService.addIdcardInfo(idCard);
        return "OK";
    }

    //获得用户所有订单
    @RequestMapping("get_userAllOrder")
    @ResponseBody
    public List<Order> getUserAllOrder(Integer belongId,Integer userId,String status){
       return orderService.getUserAllOrder(belongId,userId,status);
    }


    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        OrderController.logger = logger;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public IdCardService getIdCardService() {
        return idCardService;
    }

    public void setIdCardService(IdCardService idCardService) {
        this.idCardService = idCardService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
