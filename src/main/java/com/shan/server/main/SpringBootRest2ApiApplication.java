package com.shan.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.shan"})
public class SpringBootRest2ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRest2ApiApplication.class, args);
	}
}
