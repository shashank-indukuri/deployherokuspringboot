package com.test.cicd.testspringboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestspringbootApplicationTests {

	@Autowired
	TestspringbootApplication testspringbootApplication;

	@Test
	void contextLoads() {
	}

	@Test
	void welcome() {
        assertEquals( "Hello Spring", testspringbootApplication.welcome());
    }

    @Test
    void version() {
        assertEquals( "The current version is 0.0.2", testspringbootApplication.version());
    }

}
