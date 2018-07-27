package com.rentcar.dao;

import com.rentcar.pojo.Image;
import org.apache.ibatis.annotations.Param;


/**
 * @author Xiaoliu
 */
public interface ImageMapper {

    /**
     * 保存图片
     * @param image : 图片对象
     * @return 图片资源 对象
     */
    Integer saveImage(Image image);
}
