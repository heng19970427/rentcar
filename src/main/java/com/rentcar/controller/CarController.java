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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author zr XiaoLiu
 */
@RestController
@RequestMapping("api_v1/car")
public class CarController {
    private static Logger logger = Logger.getLogger(CarController.class);
    @Autowired
    private CarManagerService carManagerService;

    @Autowired
    private ImageService imageService;

    @RequestMapping("all_car")
    public List<Car> getAllCar(@RequestParam("userId") int userId,HttpServletRequest request){
        String basePath = request.getSession().getServletContext().getRealPath("/")+"static\\upload\\";
        return carManagerService.getAllCar(userId,basePath);
    }

    @RequestMapping("add_car")
    public String addCar(Car car, @RequestParam("files") MultipartFile[] imgs, HttpServletRequest request){
        if(imgs!=null&&imgs.length>0){
            StringBuilder images= new StringBuilder();
            //循环获取file数组中得文件
            for (MultipartFile file : imgs) {
                String basePath = request.getSession().getServletContext().getRealPath("/") + "static\\upload";
                //保存文件
                Image image = FileUtil.saveFile(file, basePath);
                imageService.saveImage(image);
                images.append(";");
            }
            car.setImg(images.toString());
        }
        carManagerService.addCar(car);
        return "OK";
    }
}
