package com.rentcar.service.impl;
import java.util.List;

import com.rentcar.dao.CarMapper;
import com.rentcar.dao.CaroptionMapper;
import com.rentcar.dao.ImageMapper;
import com.rentcar.dao.SellerMapper;
import com.rentcar.pojo.*;
import com.rentcar.pojo.group.CarGroup;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rentcar.service.CarService;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarMapper carMapper;

	@Autowired
	private SellerMapper sellerMapper;

	@Autowired
	private CaroptionMapper caroptionMapper;

	@Autowired
	private ImageMapper imageMapper;
	/**
	 * 查询全部
	 */
	@Override
	public List<Car> findAll() {
		return carMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Car> page=   (Page<Car>) carMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 * @param carGroup
	 */
	@Override
	public void add(CarGroup carGroup, HttpServletRequest request) {
		SecurityContextImpl securityContextImpl = (SecurityContextImpl) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
		//获取用户名
		String username = securityContextImpl.getAuthentication().getName();
		SellerExample sellerExample=new SellerExample();
		SellerExample.Criteria criteria = sellerExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<Seller> sellers = sellerMapper.selectByExample(sellerExample);

		String imageIds="";
		List<Image> imageList = carGroup.getImageList();
		for(Image image:imageList){
			imageMapper.insert(image);
			imageIds+=image.getImageId()+"-";
		}

		Car car = carGroup.getCar();
		car.setImg(imageIds);
		car.setStatus("0");
		car.setBelong(sellers.get(0).getSellerId());
		carMapper.insert(car);

		//插入汽车选项
		List<Caroption> caroptionList = carGroup.getCaroptionList();
		for(Caroption caroption:caroptionList){
			caroption.setCarId(car.getCarId());
			caroptionMapper.insert(caroption);
		}
		//保存汽车图片
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Car car){
		carMapper.updateByPrimaryKey(car);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Car findOne(Integer id){
		return carMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			carMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(Car car, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		CarExample example=new CarExample();
		CarExample.Criteria criteria = example.createCriteria();
		
		if(car!=null){			
						if(car.getPlateNumber()!=null && car.getPlateNumber().length()>0){
				criteria.andPlateNumberLike("%"+car.getPlateNumber()+"%");
			}
			if(car.getColor()!=null && car.getColor().length()>0){
				criteria.andColorLike("%"+car.getColor()+"%");
			}
			if(car.getDesc()!=null && car.getDesc().length()>0){
				criteria.andDescLike("%"+car.getDesc()+"%");
			}
			if(car.getType()!=null && car.getType().length()>0){
				criteria.andTypeLike("%"+car.getType()+"%");
			}
			if(car.getFrameId()!=null && car.getFrameId().length()>0){
				criteria.andFrameIdLike("%"+car.getFrameId()+"%");
			}
			if(car.getBrand()!=null && car.getBrand().length()>0){
				criteria.andBrandLike("%"+car.getBrand()+"%");
			}
			if(car.getImg()!=null && car.getImg().length()>0){
				criteria.andImgLike("%"+car.getImg()+"%");
			}
			if(car.getStatus()!=null && car.getStatus().length()>0){
				criteria.andStatusLike("%"+car.getStatus()+"%");
			}
	
		}
		
		Page<Car> page= (Page<Car>)carMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
