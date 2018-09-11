package com.rentcar.controller;
import java.util.List;

import com.rentcar.pojo.Car;
import com.rentcar.pojo.PageResult;
import com.rentcar.pojo.Result;
import com.rentcar.pojo.Seller;
import com.rentcar.pojo.group.CarGroup;
import com.rentcar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarService carService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Car> findAll(){
		return carService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return carService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param carGroup
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody CarGroup carGroup,HttpServletRequest request){
		try {

			carService.add(carGroup,request);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param car
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Car car){
		try {
			carService.update(car);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public Car findOne(Integer id){
		return carService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			carService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param car
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody Car car, int page, int rows  ){
		return carService.findPage(car, page, rows);		
	}
	
}
