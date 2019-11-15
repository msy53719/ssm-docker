package com.ssm.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloController {

	@RequestMapping(value = "index")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}