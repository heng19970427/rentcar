package com.rentcar.service.impl;

import com.rentcar.dao.OrderMapper;
import com.rentcar.pojo.Order;
import com.rentcar.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<Order> getUserAllOrder(int userId) {
        return orderMapper.queryUserAllOrder(userId);
    }

    @Override
    public int createOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    public OrderMapper getOrderMapper() {
        return orderMapper;
    }

    public void setOrderMapper(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }
}
