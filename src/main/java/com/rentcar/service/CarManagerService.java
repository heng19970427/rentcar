package com.rentcar.service;


import com.rentcar.pojo.Car;

import java.util.List;
/**
 * @author zr
 */
public interface CarManagerService {

    /**
     * 获取用户租用所有车辆
     * @param userId: 用户id
     * @return List 所有用户租用车辆
     */
    List<Car> getAllCar(int userId);
}
