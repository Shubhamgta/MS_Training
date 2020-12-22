package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldDemoApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(HelloWorldDemoApplication.class);
		SpringApplication.run(HelloWorldDemoApplication.class, args); //spring container
		logger.trace("spring container created");
	}

}
