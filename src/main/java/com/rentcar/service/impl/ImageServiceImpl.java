package com.rentcar.service.impl;

import com.rentcar.dao.ImageMapper;
import com.rentcar.pojo.Image;
import com.rentcar.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;

public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageMapper imageMapper;

    @Override
    public int addImage(Image image) {
        return imageMapper.insertImage(image);
    }

    public void setImageMapper(ImageMapper imageMapper) {
        this.imageMapper = imageMapper;
    }
}
