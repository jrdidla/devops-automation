package com.devops.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}
	public String message() {
		return "Welcome to Java Techie";
	}

}
