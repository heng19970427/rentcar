package com.rentcar.service;

import com.rentcar.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> getUserAllOrder(int userId);
    int createOrder(Order order);
}
