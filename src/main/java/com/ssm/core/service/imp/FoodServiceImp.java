package com.ssm.core.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.core.dao.FoodMapper;
import com.ssm.core.dto.FoodDto;
import com.ssm.core.enity.Food;
import com.ssm.core.service.FoodService;

@Service
public class FoodServiceImp implements FoodService {

	@Autowired
	FoodMapper foodMapper;

	public List<Food> queryAllFood() {
		List<Food> list = foodMapper.selectAllFood();
		return list;

	}

	public void addFood(FoodDto fooDto) {
		Food food = new Food();
		food.setColour(fooDto.getColour());
		food.setId(1);
		food.setName(fooDto.getName());
		food.setTime("2017-08-09");
		food.setType(fooDto.getType());
		foodMapper.insertFood(food);

	}

	public List<Food> queryById(int id) {
		List<Food> list = foodMapper.selectFood(id);
		return list;
	}

}
