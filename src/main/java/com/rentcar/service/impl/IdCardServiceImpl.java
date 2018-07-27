package com.rentcar.service.impl;

import com.rentcar.dao.IdCardMapper;
import com.rentcar.pojo.IdCard;
import com.rentcar.service.IdCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdCardServiceImpl implements IdCardService {
    @Autowired
    IdCardMapper idCardMapper;

    @Override
    public boolean addIdcardInfo(IdCard idCard) {
        if(idCardMapper.insertIdCard(idCard)>0){
            return true;
        }
        return false;
    }

    public void setIdCardMapper(IdCardMapper idCardMapper) {
        this.idCardMapper = idCardMapper;
    }
}
