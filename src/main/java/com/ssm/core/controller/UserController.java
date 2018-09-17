package com.ssm.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.core.dto.ResultDto;
import com.ssm.core.dto.UserLoginDto;

@RestController
public class UserController {
	private static Logger log = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(value = "/register", method = { RequestMethod.POST }, produces = {
			"application/json;charset=utf-8" }, consumes = { "application/json;charset=utf-8" })
	@ResponseBody
	public ResultDto register(@RequestBody UserLoginDto user) {
		user.getId();
		user.getName();
		user.getPhone();
		user.getSex();
		user.getSex();
		log.debug("id:{}\n name:{}\n phone:{}\n sex:{}\n email:{}\n", user.getId(), user.getName(), user.getPhone(),
				user.getSex(), user.getEmail());
		return null;
	}

	@RequestMapping(value = "/login", method = { RequestMethod.POST }, produces = {
			"application/json;charset=utf-8" }, consumes = { "application/json;charset=utf-8" })
	@ResponseBody
	public ResultDto userLogin(@RequestBody UserLoginDto user) {

		return null;
	}

	public ResultDto queryUserInfo() {
		return null;
	}

}
