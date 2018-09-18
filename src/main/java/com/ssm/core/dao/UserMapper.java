package com.ssm.core.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import com.ssm.core.enity.UserLogin;

@Mapper
public interface UserMapper {
	
	//@ResultMap()
	@Results({
		@Result(property="",column="")	
	})
	@Insert("insert into userLogin values(#{name},#{password})")
	public void insertUser(UserLogin user);

	@Select("select * from userLogin where username")
	public void selectUserbyid();

}
