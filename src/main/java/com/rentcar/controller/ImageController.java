package com.rentcar.controller;

import com.rentcar.pojo.Result;
import com.rentcar.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @RequestMapping("uploadImage")
    public Result uploadImage(MultipartFile file, HttpSession session,HttpServletRequest request){
        try {
        String path = session.getServletContext().getRealPath("/static");
        // fileName唯一性
        int a = ThreadLocalRandom.current().nextInt(100000, 999999);
        String fileName = "" + a + System.currentTimeMillis() + file.getOriginalFilename();
        //目标文件
        File targetFile = new File(path,fileName);

        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
            //将内存中的数据写入磁盘
            file.transferTo(targetFile);
            String fileUrl = request.getContextPath() + "/static/" + fileName;

            return new Result(true,fileUrl);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"上传失败");
        }

    }
}
