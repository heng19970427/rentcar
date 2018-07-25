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

public class OrderMapperTest extends BaseTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testInsertOrder() throws ParseException {
        Order order=new Order();
        Car car=new Car();
        car.setCarId(1);
        User user=new User();
        user.setUserId(3);
        DisCountPackage disCountPackage=new DisCountPackage();
        disCountPackage.setDisCountPackageId(1);
        order.setCar(car);
        order.setUser(user);
        order.setDiscountPackage(disCountPackage);
        order.setFee(3500);
        order.setFuelRemain(3);
        order.setStatus("出租中");
        order.setInvoice(0);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");

        order.setRentDate(dateFormat.parse("2018-07-03"));
        order.setReturnDate(dateFormat.parse("2018-07-08"));
        order.setReturnDateReal(dateFormat.parse("2018-07-08"));
        orderMapper.insertOrder(order);
    }
}
