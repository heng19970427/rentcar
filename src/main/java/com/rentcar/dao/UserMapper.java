package com.rentcar.dao;

import com.rentcar.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Xiaoliu
 */
public interface UserMapper {

    /**
     * 根据用户身份查询符合的用户列表
     * @param roleId : 查询参数 1:警官, 2:商家, 3:用户
     * @return List 符合身份的用户
     */
    List<User> getUsersByRoleId(int roleId);

    /**
     * 查询所有商家
     * @return List 所有商家
     */
    List<User> queryAllUserShop();

    /**
     * 验证用户手机号和密码
     * @param phone : 手机号
     * @param password : 密码
     * @return User对象
     */
    User queryUserByPhoneAndPassword(@Param("phone") String phone,@Param("password") String password);

    /**
     * 更新用户登录密钥
     * @param userId : 用户id
     * @param token : 登录密钥
     * @return 更新行数
     */
    @Update("update user set token=#{token} where userId=#{userId}")
    int updateUserToken(@Param("userId") Integer userId,@Param("token") String token);
}
