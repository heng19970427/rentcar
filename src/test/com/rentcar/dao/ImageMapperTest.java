package com.rentcar.dao;

import com.rentcar.BaseTest;
import com.rentcar.pojo.Image;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class ImageMapperTest extends BaseTest {
    @Autowired
    ImageMapper imageMapper;

    @Test
    public void testSaveImage(){
        Image image = new Image();
        image.setPath("1.jpg");
        image.setTitle("title");
        Integer id = imageMapper.insertImage(image);
        System.out.println(id);
        System.out.println(image.getImageId());
        assertEquals(1,(int)image.getImageId());
    }
}
