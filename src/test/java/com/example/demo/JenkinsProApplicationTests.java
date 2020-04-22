package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsProApplicationTests {
	public static Logger LOGGER = LoggerFactory.getLogger(JenkinsProApplication.class);
	
	@Test
	void contextLoads() {
		LOGGER.info("test cases are going to execute");
		assertEquals(true, true);
	}

}
