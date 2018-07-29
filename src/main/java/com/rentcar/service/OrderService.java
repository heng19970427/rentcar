package com.rentcar.service;

import com.rentcar.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> getUserAllOrder(Integer belongId,Integer userId,String status);
    int createOrder(Order order);

    void alterOrder(Order order);
}
