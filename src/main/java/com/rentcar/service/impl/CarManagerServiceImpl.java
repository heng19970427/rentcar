package com.rentcar.service.impl;

import com.rentcar.dao.CarMapper;
import com.rentcar.dao.ImageMapper;
import com.rentcar.pojo.Car;
import com.rentcar.pojo.Image;
import com.rentcar.pojo.User;
import com.rentcar.service.CarManagerService;
import com.rentcar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zr
 */
@Service
public class CarManagerServiceImpl implements CarManagerService {
    @Autowired
    private CarMapper carMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private ImageMapper imageMapper;
    @Override
    public List<Car> getAllCar(int userId) {
        List<Car> carList=carMapper.queryCarList(userId);
        User belong = userService.getUserByUserId(userId);
        for (Car car : carList){
            //封装商家
            car.setBelong(belong);
            //获取图片数组
            String[] imgPaths = car.getImg().split(";");
            //获取图片封装汽车图片集合
            List<Image> images = new ArrayList<Image>();
            for(int i=0;i<imgPaths.length;i++){
                Image image = imageMapper.queryCarImgPath(Integer.valueOf(imgPaths[i]));
                images.add(image);
            }
            car.setImages(images);
        }


        return carList;
    }

    @Override
    public List<Car> getAllUsingCar() {
        return carMapper.queryAllUsingCar();
    }

    public int addCar(Car car){
        return carMapper.insertCar(car);
    }
    public void setCarMapper(CarMapper carMapper) {
        this.carMapper = carMapper;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setImageMapper(ImageMapper imageMapper) {
        this.imageMapper = imageMapper;
    }
}
