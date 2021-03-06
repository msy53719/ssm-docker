package com.ssm.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import com.ssm.core.enity.Food;

@Mapper
public interface FoodMapper {

	@Insert("insert into food(id,name,type,colour,time)values(#{id},#{name},#{type},#{colour},#{time})")
	// @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	void insertFood(Food food);

	@Select("select id,name,type,colour,time from food where id=#{id}")
	Food selectFood(@Param("id") int id);

	@Select("select id,name,type,colour,time from food")
	List<Food> selectAllFood();

	@Select("select id from food order by id desc limit 1")
	int selectId();
	
	@Select("select id,name,type,colour,time from food order by id desc limit 1")
	Food selectObj();
}
