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

    /**
    * @Description: 获取全区正在出租的车辆
    * @Param: []
    * @return: java.util.List<com.rentcar.pojo.Car>
    * @Author: Zr
    * @Date: 2018/7/26
    */
    List<Car> getAllUsingCar();
    
    /** 
    * @Description: 添加车辆 
    * @Param: [car] 
    * @return: int 
    * @Author: Zr 
    * @Date: 2018/7/27 
    */
    int addCar(Car car);
}
