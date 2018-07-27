package com.rentcar.controller;

import com.rentcar.pojo.Car;
import com.rentcar.pojo.Image;
import com.rentcar.service.CarManagerService;
import com.rentcar.util.FileUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author zr XiaoLiu
 */
@Controller
@RequestMapping("car/api_v1")
public class CarController {
    private static Logger logger = Logger.getLogger(CarController.class);
    @Autowired
    private CarManagerService carManagerService;


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

    @RequestMapping("all_car")
    @ResponseBody
    public List<Car> getAllCar(int userId){
        return carManagerService.getAllCar(userId);
    }

    @RequestMapping("add_car")
    @ResponseBody
    public String addCar(Car car, @RequestParam("files") MultipartFile[] imgs){
        if(imgs!=null&&imgs.length>0){
            //循环获取file数组中得文件
            for(int i = 0;i<imgs.length;i++){
                MultipartFile file = imgs[i];
                //保存文件
                Image image = saveFile(file);
            }
        }
        return "OK";
    }

    @RequestMapping("test_add_car")
    public String testAdd(){
        return "testJsp";
    }

    private Image saveFile(MultipartFile file) {
        //判断文件是否为空
        if (!file.isEmpty()){
            try {
                Image image=new Image();
                //文件保存路径
                String basePath = FileUtil.getImgBasePath()+"/images";
                logger.debug("图片基本路径:"+basePath);
                String title=file.getOriginalFilename();
                String saveName=FileUtil.getRandomFileName();
                logger.debug("saveName");
                String filePath=basePath+"/"+saveName;

                image.setTitle(title);
                image.setPath(saveName);
                //转存文件
                file.transferTo(new File(filePath));
                logger.debug("图片保存成功");
                return image;

            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
