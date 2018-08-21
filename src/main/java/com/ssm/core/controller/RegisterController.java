package com.ssm.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.core.enity.User;


@RestController
public class RegisterController {
	private static Logger log = LoggerFactory.getLogger(RegisterController.class);

	@RequestMapping(value = "/register", method = { RequestMethod.POST }, produces = { "application/json",
			"application/xml" }, consumes = { "application/json", "application/xml" })
	@ResponseBody
	public User register(@RequestBody User user) {
		user.getId();
		user.getName();
		user.getPhone();
		user.getSex();
		user.getSex();
		log.debug("id:{}\n,name:{}\n,phone:{}\n,sex{}\n,email{}\n", user.getId(), user.getName(), user.getPhone(),
				user.getSex(), user.getEmail());
		return user;
	}

}
