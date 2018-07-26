package com.rentcar.service;

import com.rentcar.pojo.DisCountPackage;

import java.util.List;

/**
 * @author zr
 */
public interface DisCountPackageService {
    /**
     * 获取该商家的所有打折套餐
     * @param userId : 商家 userId
     * @return List 该商家的所有打折套餐
     */
    List<DisCountPackage> getAllDisCountPackage(int userId);
}
