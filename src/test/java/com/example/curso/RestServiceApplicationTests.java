package com.example.curso;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@SpringBootConfiguration
class RestServiceApplicationTests {
	
	public Logger log = LoggerFactory.getLogger(RestServiceApplicationTests.class);

	@Test
	void contextLoads() {
	}
	
	@Test
	void testHello() {
		log.info("into method testHello");
		log.info("exit method testHello");
	}


}
