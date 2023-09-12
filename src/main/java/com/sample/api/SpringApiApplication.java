package com.sample.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringApiApplication {

	@GetMapping("/")
	public String getMessage() {
		return "Welcome to Sample Spring Boot API";
	}
	
	@PostMapping("/{serviceName}")
	public String postMessage(@PathVariable String serviceName) {
		return "This API running on " + serviceName;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringApiApplication.class, args);
	}

}
