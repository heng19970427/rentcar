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
        List<Car> carList=carMapper.queryCarList(userId);
        for (Car car : carList){
            String[] imgPaths = car.getImg().split(";");
            car.setImgPath(imgPaths);
        }
        return carList;
    }

    @Override
    public List<Car> getAllUsingCar() {
        return carMapper.queryAllUsingCar();
    }
}
