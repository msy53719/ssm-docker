package com.ssm.core.service.imp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.core.constant.FormatConstant;
import com.ssm.core.dao.FoodMapper;
import com.ssm.core.dto.FoodDto;
import com.ssm.core.enity.Food;
import com.ssm.core.service.FoodService;
import com.ssm.core.util.DateUtil;

@Service
public class FoodServiceImp implements FoodService {

	@Autowired
	FoodMapper foodMapper;

	public List<Food> queryAllFood() {
		List<Food> list = foodMapper.selectAllFood();
		return list;

	}

	public void addFood(FoodDto fooDto) {
		int id = foodMapper.selectId();
		Food food = new Food();
		food.setColour(fooDto.getColour());
		food.setId(id + 1);
		food.setName(fooDto.getName());
		food.setTime(DateUtil.DateFrom(FormatConstant.SFORMAT, new Date()));
		food.setType(fooDto.getType());
		foodMapper.insertFood(food);

	}

	public Food queryById(int id) {
		Food food = foodMapper.selectFood(id);
		return food;
	}

}
