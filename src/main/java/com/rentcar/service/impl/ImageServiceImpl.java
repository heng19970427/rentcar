package com.rentcar.service.impl;

import com.rentcar.dao.ImageMapper;
import com.rentcar.pojo.Image;
import com.rentcar.service.ImageService;
import com.rentcar.utils.CommonTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author Xiaoliu
 */
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageMapper imageMapper;

    @Override
    public boolean saveImage(Image image) {
        MultipartFile file = image.getImg();
        if (file != null){
            String filename = CommonTool.getLowerCaseRandomUUID();
            String fileExt = CommonTool.getFileExtName(file.getOriginalFilename());
            File imgFile = new File(image.getPath()+filename+fileExt);
            try {
                file.transferTo(imgFile);
                image.setImg(null);
                image.setPath("/static/upload/"+filename+fileExt);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
            return imageMapper.saveImage(image) == 1;
        }else {
            return false;
        }
    }
}
