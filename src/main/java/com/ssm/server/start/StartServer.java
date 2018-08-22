package com.ssm.server.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ssm.core"}) 
@EnableSwagger2
public class StartServer {

	public static void main(String[] args) {
		SpringApplication.run(StartServer.class, args);
	}

}
