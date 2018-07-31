package com.rentcar.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rentcar.BaseTest;
import com.rentcar.pojo.IdCard;
import com.rentcar.pojo.OrderForm;
import com.rentcar.pojo.Response;
import com.rentcar.pojo.User;
import com.rentcar.service.IdCardService;
import com.rentcar.service.OrderService;
import com.rentcar.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class OrderControllerTest extends BaseTest{
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;
    @Autowired
    private IdCardService idCardService;

    @Test
    public void testCreateOrder() throws IOException {
        String json="{\"phone\":\"17379611111\",\"idCard\":{\"name\":\"朱瑞\",\"sex\":\"男\",\"folk\":\"汉\",\"birthday\":\"1998-11-25\",\"idNumber\":\"360782199811256217\",\"address\":\"江西省南康市东山街道办事处东山南路服装城明珠楼D栋604号\",\"agency\":\"南康市公安局\",\"expireStart\":\"2015-06-08\",\"expireEnd\":\"2020-06-08\"},\"car\":{\"carId\":1,\"plateNumber\":\"赣D829654\",\"color\":\"白色\",\"desc\":\"两厢|1.3自动|乘坐5人\",\"fuelType\":\"汽油\",\"type\":\"奥迪A6321\",\"frameId\":\"WVWPR13C6AE170920\",\"brand\":\"奥迪\",\"img\":\"13\",\"status\":\"未出租\",\"rentFee\":300,\"deposit\":1500,\"capacity\":40,\"initFuel\":20,\"images\":[{\"imageId\":13,\"path\":\"/Rentcar/static/upload/c2f4c8a8666e449293cc3b0a1e0ebbe6.jpg\",\"title\":\"图片上传测试\"}],\"belong\":{\"userId\":3,\"username\":null,\"password\":null,\"token\":null,\"company\":null,\"companyLocation\":null,\"phone\":null,\"account\":null,\"email\":null,\"img\":null,\"note\":null,\"verified\":false,\"verifyId\":null,\"role\":null,\"idCard\":null}},\"discountPackage\":{\"disCountPackageId\":1,\"disCountFee\":30,\"day\":4,\"belong\":null},\"belong\":{\"username\":\"顺丰租车\",\"userId\":3},\"rentDate\":\"2018-07-29\",\"returnDate\":\"2018-07-29\"}";
        ObjectMapper mapper = new ObjectMapper();
        OrderForm orderForm=mapper.readValue(json,OrderForm.class);
        createOrder(orderForm);
    }
    public void createOrder(OrderForm orderForm){
        IdCard idCard=orderForm.getIdCard();
        if(idCard==null){
            orderForm.setStatus("未提车");
        }
        else {
            orderForm.setStatus("出租中");
            idCardService.addIdcardInfo(idCard);
            //线下租车 user==null
            User user=userService.getUserByPhone(orderForm.getPhone());
            if(user==null){
                user=new User();
                user.setIdCard(idCard);
                user.setPhone(orderForm.getPhone());
                userService.addUser(user);
            }else{
                orderForm.setUser(user);
            }
            idCardService.addIdcardInfo(idCard);
        }
        orderService.createOrder(orderForm);
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public IdCardService getIdCardService() {
        return idCardService;
    }

    public void setIdCardService(IdCardService idCardService) {
        this.idCardService = idCardService;
    }
}
