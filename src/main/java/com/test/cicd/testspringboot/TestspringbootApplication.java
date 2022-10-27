package com.test.cicd.testspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestspringbootApplication.class, args);
	}

	@GetMapping
	public String welcome() {
		return "Hello Spring Boot Test. Welcome to GitHub Actions.";
	}

	@GetMapping("/version")
	public String version() {
		return "The current version is 0.0.2";
	}
}
