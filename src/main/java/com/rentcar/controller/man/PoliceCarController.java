package com.rentcar.controller.man;

import com.rentcar.pojo.Car;
import com.rentcar.service.CarManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zr
 */
@Controller
@RestController
@RequestMapping("police/api_v1")
public class PoliceCarController {
    private CarManagerService carManagerService;

    @RequestMapping("car_manager")
    public String carInfo(){
        carManagerService.getAllUsingCar();
        return "police/car_manager";
    }

    @RequestMapping("car_using")
    public List<Car> getAllUsingCar(){
       return carManagerService.getAllUsingCar();
    }
}
