package com.rentcar.dao;

import com.rentcar.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrderMapper {
    int insertOrder(Order order);
    List<Order> queryUserAllOrder(@Param("belongId")Integer belongId,@Param("userId") Integer userId,@Param("status") String status);
    void updateOrder(Order order);
}
