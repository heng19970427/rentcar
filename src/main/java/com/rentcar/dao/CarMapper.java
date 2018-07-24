package com.rentcar.dao;

import com.rentcar.pojo.Car;

import java.util.List;

public interface CarMapper {
   List<Car> queryCarList(int userId);
}
