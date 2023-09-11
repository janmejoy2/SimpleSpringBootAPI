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
		return "Sample Spring Boot Api is Running on Red Hat OpenShift";
	}
	
	@GetMapping("/version")
	public String getVersion2() {
		return "Sample Spring Boot Api is Running on Red Hat OpenShift this is version 2";
	}
	
	@PostMapping("/{name}")
	public String postMessage(@PathVariable String name) {
		return "The Api is build by: " + name;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringApiApplication.class, args);
	}

}
