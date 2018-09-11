package com.rentcar.dao;

import com.rentcar.pojo.Caroption;
import com.rentcar.pojo.CaroptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaroptionMapper {
    int countByExample(CaroptionExample example);

    int deleteByExample(CaroptionExample example);

    int deleteByPrimaryKey(Integer carOptionId);

    int insert(Caroption record);

    int insertSelective(Caroption record);

    List<Caroption> selectByExample(CaroptionExample example);

    Caroption selectByPrimaryKey(Integer carOptionId);

    int updateByExampleSelective(@Param("record") Caroption record, @Param("example") CaroptionExample example);

    int updateByExample(@Param("record") Caroption record, @Param("example") CaroptionExample example);

    int updateByPrimaryKeySelective(Caroption record);

    int updateByPrimaryKey(Caroption record);
}