package com.rentcar.dao;

import com.rentcar.BaseTest;
import com.rentcar.pojo.Car;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CarMapperTest extends BaseTest{
    @Autowired
    private CarMapper carMapper;

    @Test
    public void testQueryCarList(){
        List<Car> carList = carMapper.queryCarList(3);
        assertEquals(1, carList.size());
    }

    public CarMapper getCarMapper() {
        return carMapper;
    }

    public void setCarMapper(CarMapper carMapper) {
        this.carMapper = carMapper;
    }
}
