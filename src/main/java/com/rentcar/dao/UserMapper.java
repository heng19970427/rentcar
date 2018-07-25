package com.rentcar.dao;

import com.rentcar.pojo.User;

import java.util.List;

/**
 * @author Xiaoliu
 */
public interface UserMapper {

    /**
     * 根据用户身份查询符合的用户列表
     * @param roleId : 查询参数 1:警官, 2:商家, 3:用户
     * @return 符合身份的用户(list)
     */
    List<User> getUsersByRoleId(int roleId);

    List<User> queryAllUserShop();
}
