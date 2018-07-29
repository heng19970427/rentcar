package com.rentcar.controller;

import com.rentcar.pojo.Car;
import com.rentcar.pojo.Image;
import com.rentcar.service.CarManagerService;
import com.rentcar.service.ImageService;
import com.rentcar.utils.FileUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author zr XiaoLiu
 */
@Controller
@RequestMapping("api_v1/car")
public class CarController {
    private static Logger logger = Logger.getLogger(CarController.class);
    @Autowired
    private CarManagerService carManagerService;

    @Autowired
    private ImageService imageService;

    @RequestMapping("car_info")
    public String carInfo(){
        return "car_info";
    }

    @RequestMapping("car_location")
    public String carLocation(){
        return "car_location";
    }

    @RequestMapping("car_fee")
    public String carFee(){
        return "car_fee";
    }

    @RequestMapping("car_fee_discount")
    public String carFeeDiscount(){
        return "car_fee_discount";
    }

    @RequestMapping("get_allCar")
    @ResponseBody
    public List<Car> getAllCar(int userId,HttpServletRequest request){
        String basePath=request.getContextPath();
        return carManagerService.getAllCar(userId,basePath);
    }

    @RequestMapping("add_car")
    @ResponseBody
    public String addCar(Car car, @RequestParam("files") MultipartFile[] imgs, HttpServletRequest request){
        if(imgs!=null&&imgs.length>0){
            String images="";
            //循环获取file数组中得文件
            for(int i = 0;i<imgs.length;i++){
                MultipartFile file = imgs[i];
                String basePath = request.getSession().getServletContext().getRealPath("/")+"static\\upload";
                //保存文件
                Image image = FileUtil.saveFile(file,basePath);
                imageService.saveImage(image);
                images+=";";
            }
            car.setImg(images);
        }
        carManagerService.addCar(car);
        return "OK";
    }

    @RequestMapping("test_add_car")
    public String testAdd(){
        return "testJsp";
    }



    public void setCarManagerService(CarManagerService carManagerService) {
        this.carManagerService = carManagerService;
    }

    public void setImageService(ImageService imageService) {
        this.imageService = imageService;
    }
}
