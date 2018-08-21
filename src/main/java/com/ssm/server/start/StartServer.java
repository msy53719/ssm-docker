package com.ssm.server.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ssm.core"}) 
public class StartServer {

	public static void main(String[] args) {
		SpringApplication.run(StartServer.class, args);
	}

}
