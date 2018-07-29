package com.rentcar.service.impl;

import com.rentcar.dao.ImageMapper;
import com.rentcar.pojo.Image;
import com.rentcar.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Xiaoliu
 */
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageMapper imageMapper;

    @Override
    public boolean saveImage(Image image) {
        if(imageMapper.insertImage(image)>0){
            return true;
        }
        return false;
    }
}
