package com.rentcar.dao;

import com.rentcar.pojo.IDCard;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface IDCardMapper {

    @Select("select * from IDCard where IDCardId=#{id}")
    public IDCard getIDCardByIDCardId(@Param("id") Integer IDCardId);
}
