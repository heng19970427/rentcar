package com.rentcar.service;


import com.rentcar.pojo.Car;

import java.util.List;

public interface CarManagerService {

    List<Car> getAllCar(int userId);
}
