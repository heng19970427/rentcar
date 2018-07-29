package com.rentcar.controller;

import com.rentcar.pojo.DisCountPackage;
import com.rentcar.service.DisCountPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zr
 */
@RestController
@RequestMapping("api_v1/discount")
public class DisCountPackageController {
    @Autowired
    private DisCountPackageService disCountPackageService;

    @RequestMapping("get_allDiscount")
    @ResponseBody
    public List<DisCountPackage> getAllDisCountPackage(int userId){
        return disCountPackageService.getAllDisCountPackage(userId);
    }
}
