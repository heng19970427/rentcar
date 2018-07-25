package com.rentcar.dao;

import com.rentcar.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> getUsersByRoleId(int role_id);
}
