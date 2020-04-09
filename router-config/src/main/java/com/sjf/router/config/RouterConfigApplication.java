package com.sjf.router.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RouterConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(RouterConfigApplication.class, args);
	}

}
