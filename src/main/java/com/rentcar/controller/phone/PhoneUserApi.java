package com.rentcar.controller.phone;

import com.rentcar.pojo.Response;
import com.rentcar.pojo.User;
import com.rentcar.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author Xiaoliu
 */
@RestController
@RequestMapping("phone/api_v1")
public class PhoneUserApi {
    private static Logger logger = Logger.getLogger(PhoneUserApi.class);

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public User login(@RequestParam("phone")String phone, @RequestParam("password") String password){
        User user = userService.getUserByPhoneAndPassword(phone,password);
        if (user != null){
            String uuid = UUID.randomUUID().toString().replace("-","").toLowerCase() ;
            if (userService.updateUserToken(user.getUserId(),uuid)){
                user.setToken(uuid);
                logger.info("用户 "+user.getUsername()+" 登录成功");
                return user;
            }else {
                logger.debug("生成uuid"+uuid);
                return null;
            }
        }else {
            logger.info(phone+" 尝试登陆失败!");
            return null;
        }
    }

    @RequestMapping("verify")
    public Response verify(@RequestParam("phone")String phone,@RequestParam("token")String token){
        Response resp = new Response();
        if (userService.verify(phone,token)){
            resp.setCode(0);
            resp.setMsg("token有效");
        }else {
            resp.setCode(-2);
            resp.setMsg("token失效,请重新登录!");
        }
        return resp;
    }
}
