package com.rentcar.dao;

import com.rentcar.pojo.Image;

public interface ImageMapper {
    /**
     * @Description: 根据id查询汽车图片
     * @Param: [imageId]
     * @return: com.rentcar.pojo.Image
     * @Author: Zr
     * @Date: 2018/7/27
     */
    Image queryCarImgPath(int imageId);

    int insertImage(Image image);
}
