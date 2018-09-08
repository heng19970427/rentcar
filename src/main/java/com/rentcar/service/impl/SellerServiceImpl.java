package com.rentcar.service.impl;
import java.util.List;

import com.rentcar.dao.SellerMapper;
import com.rentcar.pojo.PageResult;
import com.rentcar.pojo.SellerExample;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rentcar.pojo.Seller;
import com.rentcar.service.SellerService;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	private SellerMapper sellerMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Seller> findAll() {
		return sellerMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Seller> page=   (Page<Seller>) sellerMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Seller seller) {
		//bcrypt密码加密
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = passwordEncoder.encode(seller.getPassword());
		seller.setPassword(password);
		seller.setStatus("0");
		sellerMapper.insert(seller);		
	}

	/**
	 * 修改
	 */
	@Override
	public void update(Seller seller){
		sellerMapper.updateByPrimaryKey(seller);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Seller findOne(Integer id){
		return sellerMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			sellerMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Seller seller, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		SellerExample example=new SellerExample();
		SellerExample.Criteria criteria = example.createCriteria();
		
		if(seller!=null){			
						if(seller.getUsername()!=null && seller.getUsername().length()>0){
				criteria.andUsernameLike("%"+seller.getUsername()+"%");
			}
			if(seller.getPhone()!=null && seller.getPhone().length()>0){
				criteria.andPhoneLike("%"+seller.getPhone()+"%");
			}
			if(seller.getStatus()!=null && seller.getStatus().length()>0){
				criteria.andStatusLike("%"+seller.getStatus()+"%");
			}
	
		}
		
		Page<Seller> page= (Page<Seller>)sellerMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void updateStatus(Integer sellerId,String status) {
		Seller seller = sellerMapper.selectByPrimaryKey(sellerId);
		seller.setStatus(status);
		sellerMapper.updateByPrimaryKey(seller);
	}
}
