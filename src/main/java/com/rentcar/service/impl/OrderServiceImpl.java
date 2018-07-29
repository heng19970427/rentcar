package com.rentcar.service.impl;

import com.rentcar.dao.OrderMapper;
import com.rentcar.pojo.Order;
import com.rentcar.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<Order> getUserAllOrder(Integer belongId,Integer userId,String status) {
        return orderMapper.queryUserAllOrder(belongId,userId,status);
    }

    @Override
    public int createOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    @Override
    public void alterOrder(Order order) {
        orderMapper.updateOrder(order);
    }

    public OrderMapper getOrderMapper() {
        return orderMapper;
    }

    public void setOrderMapper(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }
}
