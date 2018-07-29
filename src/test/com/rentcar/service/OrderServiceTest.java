package com.rentcar.service;

import com.rentcar.BaseTest;
import com.rentcar.pojo.Order;
import com.rentcar.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;

public class OrderServiceTest extends BaseTest{
    @Autowired
    private OrderService orderService;
    private SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
    public void testCreateOrder(){
        Order order=new Order();
        User user=new User();
        user.setUserId(3);
        order.setUser(user);
        order.setStatus("未提车");
        //order.setReturnDateReal(dateFormat.parse());
    }
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
