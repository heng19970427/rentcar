package com.rentcar.service.impl;
import java.util.List;

import com.rentcar.dao.PoliceMapper;
import com.rentcar.pojo.PageResult;
import com.rentcar.pojo.PoliceExample;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rentcar.pojo.Police;
import com.rentcar.service.PoliceService;

import org.springframework.stereotype.Service;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PoliceServiceImpl implements PoliceService {

	@Autowired
	private PoliceMapper policeMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Police> findAll() {
		return policeMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Police> page=   (Page<Police>) policeMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Police police) {
		policeMapper.insert(police);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Police police){
		policeMapper.updateByPrimaryKey(police);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Police findOne(Integer id){
		return policeMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			policeMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Police police, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		PoliceExample example=new PoliceExample();
		PoliceExample.Criteria criteria = example.createCriteria();
		
		if(police!=null){			
						if(police.getUsername()!=null && police.getUsername().length()>0){
				criteria.andUsernameLike("%"+police.getUsername()+"%");
			}
			if(police.getPassword()!=null && police.getPassword().length()>0){
				criteria.andPasswordLike("%"+police.getPassword()+"%");
			}
	
		}
		
		Page<Police> page= (Page<Police>)policeMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
