package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProApplication {
	public static Logger LOGGER = LoggerFactory.getLogger(JenkinsProApplication.class);

	public static void main(String[] args) {
		
		LOGGER.info("Application is going to start");
		LOGGER.info("Application is going to start1");
		SpringApplication.run(JenkinsProApplication.class, args);
		LOGGER.info("Application Ended here");
	}

}
