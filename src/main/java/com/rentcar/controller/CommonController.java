package com.rentcar.controller;

import com.rentcar.pojo.Image;
import com.rentcar.pojo.Response;
import com.rentcar.service.ImageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Xiaoliu
 */
@RestController
@RequestMapping("api_v1/common")
public class CommonController {
    private static Logger logger = Logger.getLogger(CommonController.class);
    @Autowired
    ImageService imageService;


}
