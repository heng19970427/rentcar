package com.rentcar.dao;

import com.rentcar.pojo.Car;

import java.util.List;

/**
 * @author zr
 */
public interface CarMapper {
   /**
    * 根据 userId 查询当前租用车辆
    * @param userId : 用户id
    * @return list 租用车辆
    */
   List<Car> queryCarList(int userId);
}
