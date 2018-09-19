package com.ssm.core.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ssm.core.dto.FoodDto;
import com.ssm.core.dto.ResultDto;
import com.ssm.core.enity.Food;
import com.ssm.core.service.FoodService;

@RestController
public class FirstController {

	@Autowired
	FoodService foodService;

	private static Logger log = LoggerFactory.getLogger(FirstController.class);

	@RequestMapping(value = "/addFood", method = { RequestMethod.POST }, produces = {
			"application/json;charset=utf-8" }, consumes = { "application/json;charset=utf-8" })
	@ResponseBody
	public ResultDto andFood(@RequestBody FoodDto foddDto) {
		log.debug("name:{},colour:{},type:{}", foddDto.getColour(), foddDto.getName(), foddDto.getType());
		foodService.addFood(foddDto);
		ResultDto resultDto = new ResultDto();
		resultDto.setCode("0000");
		resultDto.setMessage("成功");
		return resultDto;
	}

	@RequestMapping(value = "/query/{id}", method = { RequestMethod.GET }, produces = {
			"application/json;charset=utf-8" })
	public Food queryFoodById(@PathVariable int id) {
		log.debug("id:{}", id);
		Food food = foodService.queryById(id);
		// ResultDto resultDto = new ResultDto();
		// resultDto.setCode("0000");
		// resultDto.setMessage("成功");
		// resultDto.setList(list);
		return food;
	}

	@RequestMapping(value = "/query/all", method = { RequestMethod.GET }, produces = {
			"application/json;charset=utf-8" })
	public List<Food> queryAllFood() {
		List<Food> list = foodService.queryAllFood();
		return list;
	}

	@RequestMapping(value = "/query/allList", method = { RequestMethod.GET }, produces = {
			"application/json;charset=utf-8" })
	public ResultDto queryAllFoodDt() {
		ResultDto recode = new ResultDto();
		recode.setCode("0000");
		recode.setMessage("查询成功");
		List<Food> food = foodService.queryAllFood();
		// Map<Object, Object> map = new HashMap<Object, Object>();
		// map.put("food", list);
		// recode.setMap(map);
		recode.setList(food);
		return recode;
	}
}
