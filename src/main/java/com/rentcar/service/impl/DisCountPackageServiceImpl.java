package com.rentcar.service.impl;

import com.rentcar.dao.DisCountPackageMapper;
import com.rentcar.pojo.DisCountPackage;
import com.rentcar.service.DisCountPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisCountPackageServiceImpl implements DisCountPackageService{
    @Autowired
    private DisCountPackageMapper disCountPackageMapper;
    @Override
    public List<DisCountPackage> getAllDisCountPackage(int userId) {
        return disCountPackageMapper.queryAllDisCount(userId);
    }

    public DisCountPackageMapper getDisCountPackageMapper() {
        return disCountPackageMapper;
    }

    public void setDisCountPackageMapper(DisCountPackageMapper disCountPackageMapper) {
        this.disCountPackageMapper = disCountPackageMapper;
    }
}
