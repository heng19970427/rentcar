package com.rentcar.service.impl;

import com.rentcar.dao.CarMapper;
import com.rentcar.dao.UserMapper;
import com.rentcar.pojo.User;
import com.rentcar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUserShop() {
        return userMapper.queryAllUserShop();
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
