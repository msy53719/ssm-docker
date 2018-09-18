package com.ssm.core.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.core.dao.UserInfoMapper;
import com.ssm.core.dto.UserInfoDto;
import com.ssm.core.dto.UserLoginDto;
import com.ssm.core.service.UserService;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	UserInfoMapper userInfoMapper;

	public void getUserInof(long userid) {
		// TODO Auto-generated method stub

	}

	public void userLogin(UserLoginDto userLoginDto) {
		// TODO Auto-generated method stub

	}

	public void userRegister(UserInfoDto userInfoDto) {
		// TODO Auto-generated method stub

	}

}
