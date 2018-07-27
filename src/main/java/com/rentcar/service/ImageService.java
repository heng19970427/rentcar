package com.rentcar.service;

import com.rentcar.pojo.Image;
import org.springframework.stereotype.Service;

/**
 * @author Xiaoliu
 */
@Service
public interface ImageService {

    /**
     * 保存图片
     * @param image : 图片Image对象
     * @return boolean 是否保存成功
     */
    boolean saveImage(Image image);
}
