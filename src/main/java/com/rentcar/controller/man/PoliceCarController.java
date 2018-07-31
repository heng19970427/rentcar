package com.rentcar.controller.man;

import com.rentcar.pojo.Car;
import com.rentcar.service.CarManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zr
 */
@Controller
@RequestMapping("api_v1/police")
public class PoliceCarController {
    @Autowired
    private CarManagerService carManagerService;

    @RequestMapping("get_AllUsingCar")
    public List<Car> getAllUsingCar(){
       return carManagerService.getAllUsingCar();
    }

    public void setCarManagerService(CarManagerService carManagerService) {
        this.carManagerService = carManagerService;
    }
}
