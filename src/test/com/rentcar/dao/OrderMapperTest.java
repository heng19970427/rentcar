package com.rentcar.dao;

import com.rentcar.BaseTest;
import com.rentcar.pojo.Car;
import com.rentcar.pojo.DisCountPackage;
import com.rentcar.pojo.Order;
import com.rentcar.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrderMapperTest extends BaseTest {

    @Autowired
    private OrderMapper orderMapper;
    static Order order;
    static {
        order=new Order();

        Car car=new Car();
        car.setCarId(1);
        User user=new User();
        User belong=new User();
        belong.setUserId(4);
        user.setUserId(3);
        DisCountPackage disCountPackage=new DisCountPackage();
        disCountPackage.setDisCountPackageId(1);

        order.setOrderId(5);
        order.setCar(car);
        order.setUser(user);
        order.setDiscountPackage(disCountPackage);
        order.setFee(3500);
        order.setFuelRemain(3);
        order.setStatus("出租中");
        order.setInvoice(0);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");

        try {
            order.setRentDate(dateFormat.parse("2018-07-01"));
            order.setReturnDate(dateFormat.parse("2018-07-08"));
            order.setReturnDateReal(dateFormat.parse("2018-07-08"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testInsertOrder() throws ParseException {
        orderMapper.insertOrder(order);
        int key=order.getOrderId();
        assertEquals(5,key);
    }

    @Test
    public void testqueryUserAllOrder(){
        List<Order> orders = orderMapper.queryUserAllOrder(3);
        assertEquals(2,orders.size());
    }

    @Test
    public void testupdateOrder(){
        orderMapper.updateOrder(order);
    }

    public void setOrderMapper(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }
}
