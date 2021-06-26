package com.gagan.demotwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemotwoApplication {

	// http://127.0.0.1:9898/hello
	@GetMapping(value="/hello")
	public String getMethodName() {
		return "Hi there, this is my first Spring Boot application.";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemotwoApplication.class, args);
	}

}
