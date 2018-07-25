package com.rentcar.service.impl;

import com.rentcar.dao.CarMapper;
import com.rentcar.pojo.Car;
import com.rentcar.service.CarManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zr
 */
@Service
public class CarManagerServiceImpl implements CarManagerService {
    @Autowired
    private CarMapper carMapper;

    @Override
    public List<Car> getAllCar(int userId) {
        return carMapper.queryCarList(userId);
    }
}
