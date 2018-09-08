package com.rentcar.service;
import java.util.List;

import com.rentcar.pojo.PageResult;
import com.rentcar.pojo.Seller;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface SellerService {
	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Seller> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Seller seller);
	
	
	/**
	 * 修改
	 */
	public void update(Seller seller);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Seller findOne(Integer id);
	
	
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
	public PageResult findPage(Seller seller, int pageNum, int pageSize);

	/** 
	* @Description: 更新商家账号状态 
	* @Param: [sellerId, status] 
	* @return: void 
	* @Author: Zr 
	* @Date: 2018/9/8 
	*/
    void updateStatus(Integer sellerId, String status);
}
