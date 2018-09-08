package com.rentcar.dao;

import com.rentcar.pojo.Leaseholder;
import com.rentcar.pojo.LeaseholderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaseholderMapper {
    int countByExample(LeaseholderExample example);

    int deleteByExample(LeaseholderExample example);

    int deleteByPrimaryKey(Integer leaseholderid);

    int insert(Leaseholder record);

    int insertSelective(Leaseholder record);

    List<Leaseholder> selectByExample(LeaseholderExample example);

    Leaseholder selectByPrimaryKey(Integer leaseholderid);

    int updateByExampleSelective(@Param("record") Leaseholder record, @Param("example") LeaseholderExample example);

    int updateByExample(@Param("record") Leaseholder record, @Param("example") LeaseholderExample example);

    int updateByPrimaryKeySelective(Leaseholder record);

    int updateByPrimaryKey(Leaseholder record);
}