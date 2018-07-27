package com.rentcar.controller;

import com.rentcar.pojo.IdCard;
import com.rentcar.pojo.Order;
import com.rentcar.pojo.OrderForm;
import com.rentcar.service.IdCardService;
import com.rentcar.service.OrderService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Xiaoliu
 */
@Controller
public class OrderController {
    private static Logger logger = Logger.getLogger(OrderController.class);
    private OrderService orderService;
    private IdCardService idCardService;
    @RequestMapping("order_man")
    public String orderMan(){
        return "order_man";
    }

    @RequestMapping("order_create")
    public String orderCreate(){
        logger.debug("");
        return "order_create";
    }

    @RequestMapping("create_order")
    @ResponseBody
    public String createOrder(OrderForm orderForm){
        logger.debug("");
        Order order=orderForm.getOrder();
        IdCard idCard=orderForm.getIdCard();
        if(idCard==null){
            order.setStatus("未提车");
        }
        else {
            order.setStatus("出租中");
            idCardService.addIdcardInfo(idCard);
        }
        orderService.createOrder(order);
        return "OK";
    }

    //商家修改订单
    /*
        两次修改订单:
        1.提车的时候
            上传身份证信息，userId为空，创建用户
        2.还车的时候
            修改订单状态，押金扣除
     */
    @RequestMapping("alter_order1")
    @ResponseBody
    public String alterOrder1(OrderForm orderForm){
        logger.debug("");
        return "OK";
    }

    @RequestMapping("alter_order2")
    @ResponseBody
    public String alterOrder2(Order order){
        logger.debug("");
        return "OK";
    }
    //获得用户所有订单
    @RequestMapping("order_user_all")
    @ResponseBody
    public List<Order> getUserAllOrder(int userId){
       return orderService.getUserAllOrder(userId);
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
}
