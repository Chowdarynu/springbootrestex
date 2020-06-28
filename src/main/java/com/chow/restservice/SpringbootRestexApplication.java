package com.chow.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.chow.*")
@SpringBootApplication
public class SpringbootRestexApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestexApplication.class, args);
	}
}
