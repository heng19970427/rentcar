package com.rentcar.dao;

import com.rentcar.BaseTest;
import com.rentcar.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapperTest extends BaseTest{
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsertUser(){
        User user=new User();
        user.setCompany("好运租车");
        user.setCompanyLocation("吉安市吉州区工业园36号");
        userMapper.insertUser(user);
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
