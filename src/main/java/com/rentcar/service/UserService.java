package com.rentcar.service;

import com.rentcar.pojo.IdCard;
import com.rentcar.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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

    User getUserByPhone(String phone);

    /**
    * @Description:
    * @Param: []
    * @return: com.rentcar.pojo.User
    * @Author: Zr
    * @Date: 2018/7/29
    */
    User checkToken(String token);

    /**
     * 通过phone和 token 验证用户
     * @param phone 用户手机号
     * @param token 用户token
     * @return {@code true}验证成功, {@code false} 验证失败
     */
    boolean verify(String phone,String token);
}
