package com.ssm.core.service;

import com.ssm.core.dto.UserInfoDto;
import com.ssm.core.dto.UserLoginDto;

public interface UserService {

	public void getUserInof(long userid);

	public void userLogin(UserLoginDto userLoginDto);

	public void userRegister(UserInfoDto userInfoDto);
}
