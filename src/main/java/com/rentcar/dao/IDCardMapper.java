package com.rentcar.dao;

import com.rentcar.pojo.IDCard;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Xiaoliu
 */
public interface IDCardMapper {

    /**
     * 根据 IDCardId 查询 身份证
     * @param idCardId :身份证id
     * @return 身份证对象 IDCard
     */
    @Select("select * from IDCard where IDCardId=#{id}")
    public IDCard getIDCardByIDCardId(@Param("id") Integer idCardId);
}
