package com.rentcar.dao;

import com.rentcar.pojo.DisCountPackage;

import java.util.List;

public interface DisCountPackageMapper {
    List<DisCountPackage> queryAllDisCount(int userId);
}
