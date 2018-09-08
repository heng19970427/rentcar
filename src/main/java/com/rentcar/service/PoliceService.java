package com.rentcar.service;
import java.util.List;

import com.rentcar.pojo.PageResult;
import com.rentcar.pojo.Police;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface PoliceService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Police> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Police police);
	
	
	/**
	 * 修改
	 */
	public void update(Police police);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Police findOne(Integer id);
	
	
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
	public PageResult findPage(Police police, int pageNum, int pageSize);
	
}
