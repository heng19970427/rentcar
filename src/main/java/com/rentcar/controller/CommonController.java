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
@RequestMapping("common/api_v1")
public class CommonController {
    private static Logger logger = Logger.getLogger(CommonController.class);
    @Autowired
    ImageService imageService;

    @RequestMapping("upload_image")
    public Response uploadImage(Image image, HttpServletRequest request){
        Response response = new Response();
        if (image.getImg() != null){
            String path = request.getSession().getServletContext().getRealPath("/static/upload/");
            image.setPath(path);
            if (imageService.saveImage(image)){
                response.setCode(0);
                response.setMsg("保存成功");
            }else {
                response.setCode(1);
                response.setMsg("保存失败,请重试!");
            }
            image.setImg(null);
            response.setData(image);
        }else {
            response.setCode(-1);
            response.setMsg("请检查请求, 未接收到图片");
        }
        return response;
    }
}
