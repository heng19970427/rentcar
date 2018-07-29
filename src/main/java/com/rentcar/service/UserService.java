package com.rentcar.service;

import com.rentcar.pojo.IdCard;
import com.rentcar.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Xiaoliu zr
 */
@Service
public interface UserService {

    /**
     * 根据 roleId 获取该身份的所有用户
     * @param roleId : 1->警察,2->商家,3->用户
     * @return List 身份的所有用户
     */
    List<User> getUsersByRoleId(int roleId);

    /**
     * 获取所有商家信息
     * @return 所有商家
     */
    List<User> getAllUserShop();

    /**
     * 验证用户手机号和密码
     * @param phone : 手机号
     * @param password : 密码
     * @return User对象
     */
    User getUserByPhoneAndPassword(String phone, String password);

    /**
     * 更新用户登录密钥
     * @param userId : 用户id
     * @param token : 登录密钥
     * @return 操作结果
     */
    boolean updateUserToken(Integer userId, String token);

    User getUserByUserId(int userId);

    /**
    * @Description: 添加用户
    * @Param: [user]
    * @return: void
    * @Author: Zr
    * @Date: 2018/7/26
    */
    void addUser(User user);

}
