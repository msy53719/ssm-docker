package com.ssm.core.service;

import java.util.List;

import com.ssm.core.dto.FoodDto;
import com.ssm.core.enity.Food;

public interface FoodService {

	public List<Food> queryAllFood();

	public void addFood(FoodDto fooDto);

	public Food queryById(int id);
}
