package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.demo.controller","com.example.demo.services","com.example.demo.Dto"})
public class EmployeeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjectApplication.class, args);
	}

}
