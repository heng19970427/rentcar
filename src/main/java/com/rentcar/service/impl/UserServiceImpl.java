package com.rentcar.service.impl;

import com.rentcar.dao.CarMapper;
import com.rentcar.dao.UserMapper;
import com.rentcar.pojo.IdCard;
import com.rentcar.pojo.User;
import com.rentcar.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private static Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsersByRoleId(int roleId) {
        logger.info("roleId = "+roleId);
        return userMapper.getUsersByRoleId(roleId);
    }

    @Override
    public List<User> getAllUserShop() {
        return userMapper.queryAllUserShop();
    }

    @Override
    public User getUserByPhoneAndPassword(String phone, String password) {
        return userMapper.queryUserByPhoneAndPassword(phone,password);
    }

    @Override
    public boolean updateUserToken(Integer userId, String token) {
        if (userMapper.updateUserToken(userId,token)==1){
            logger.info("用户 userId="+userId+" 登录");
            return true;
        }else {
            return false;
        }
    }

    @Override
    public User getUserByUserId(int userId) {
        return userMapper.queryUserByUserId(userId);
    }

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User getUserByPhone(String phone) {
        return userMapper.queryUserByPhone(phone);
    }

    @Override
    public User checkToken(String token) {
        return userMapper.queryUserByToken(token);
    }


}
