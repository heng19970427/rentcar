package com.rentcar.service;

import com.rentcar.pojo.DisCountPackage;

import java.util.List;

public interface DisCountPackageService {
    List<DisCountPackage> getAllDisCountPackage(int userId);
}
