package com.rentcar.dao;

import com.rentcar.pojo.Order;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrderMapper {
    int insertOrder(Order order);
    List<Order> queryUserAllOrder(int UserId);
    void updateOrder(Order order);
}
