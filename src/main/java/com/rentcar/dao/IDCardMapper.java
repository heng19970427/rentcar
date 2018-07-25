package com.rentcar.dao;

import com.rentcar.pojo.IdCard;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Xiaoliu
 */
public interface IDCardMapper {

    /**
     * 根据 IDCardId 查询 身份证
     * @param idCardId :身份证id
     * @return 身份证对象 IdCard
     */
    @Select("select * from IdCard where IDCardId=#{id}")
    public IdCard getIDCardByIDCardId(@Param("id") Integer idCardId);
}
