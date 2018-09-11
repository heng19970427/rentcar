package com.rentcar.service;
import java.util.List;

import com.rentcar.pojo.Car;
import com.rentcar.pojo.PageResult;
import com.rentcar.pojo.group.CarGroup;

import javax.servlet.http.HttpServletRequest;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CarService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Car> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	 * @param carGroup
	 */
    void add(CarGroup carGroup, HttpServletRequest request);

    /**
	 * 修改
	 */
	public void update(Car car);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Car findOne(Integer id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Car car, int pageNum, int pageSize);
	
}
