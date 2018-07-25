package com.rentcar.service;

import com.rentcar.dao.UserMapper;
import com.rentcar.pojo.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private static Logger logger = Logger.getLogger(UserService.class);

    @Autowired
    UserMapper userMapper;

    public List<User> getUserByRoleId(int role_id){
        logger.info("role_id = "+role_id);
        return userMapper.getUsersByRoleId(role_id);
    }
}