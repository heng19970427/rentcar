package com.rentcar.controller;

import com.rentcar.pojo.IdCard;
import com.rentcar.pojo.Order;
import com.rentcar.pojo.OrderForm;
import com.rentcar.pojo.User;
import com.rentcar.service.IdCardService;
import com.rentcar.service.OrderService;
import com.rentcar.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Xiaoliu
 */
@RestController
@RequestMapping("api_v1/order")
public class OrderController {
    private static Logger logger = Logger.getLogger(OrderController.class);
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;
    @Autowired
    private IdCardService idCardService;

    @RequestMapping("create_order")
    @ResponseBody
    public String createOrder(OrderForm orderForm){
        logger.debug("");
        Order order=orderForm.getOrder();
        User user=orderForm.getUser();
        IdCard idCard=orderForm.getIdCard();
        if(idCard==null){
            order.setStatus("未提车");
        }
        else {
            order.setStatus("出租中");
            idCardService.addIdcardInfo(idCard);
            if(order.getUser().getUserId()==null){
                //线下租车
                user.setIdCard(idCard);
                userService.addUser(user);
            }
        }
        idCardService.addIdcardInfo(idCard);
        orderService.createOrder(order);
        return "OK";
    }

    /**商家修改订单
        两次修改订单:
        1.提车的时候
            上传身份证信息，userId为空，创建用户
        2.还车的时候
            修改订单状态，押金扣除
     */
    @RequestMapping("alter_order")
    @ResponseBody
    public String alterOrder(OrderForm orderForm){
        logger.debug("");
        return "OK";
    }

    //获得用户所有订单
    @RequestMapping("order_user_all")
    @ResponseBody
    public List<Order> getUserAllOrder(int userId){
       return orderService.getUserAllOrder(userId);
    }

}
