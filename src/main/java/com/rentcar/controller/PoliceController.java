package com.rentcar.controller;
import java.util.List;

import com.rentcar.pojo.PageResult;
import com.rentcar.pojo.Police;
import com.rentcar.pojo.Result;
import com.rentcar.service.PoliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/police")
public class PoliceController {

	@Autowired
	private PoliceService policeService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<Police> findAll(){
		return policeService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return policeService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param police
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody Police police){
		try {
			policeService.add(police);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param police
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody Police police){
		try {
			policeService.update(police);
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
	public Police findOne(Integer id){
		return policeService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			policeService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param police
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody Police police, int page, int rows  ){
		return policeService.findPage(police, page, rows);		
	}
	
}
