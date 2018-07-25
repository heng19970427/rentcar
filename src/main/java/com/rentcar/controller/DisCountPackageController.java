package com.rentcar.controller;

import com.rentcar.pojo.DisCountPackage;
import com.rentcar.service.DisCountPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("discount")
public class DisCountPackageController {
    @Autowired
    private DisCountPackageService disCountPackageService;

    @RequestMapping("discount_all")
    @ResponseBody
    public List<DisCountPackage> getAllDisCountPackage(int userId){
        return disCountPackageService.getAllDisCountPackage(userId);
    }
}
