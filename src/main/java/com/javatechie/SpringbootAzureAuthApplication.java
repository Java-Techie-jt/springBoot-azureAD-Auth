package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class SpringbootAzureAuthApplication {

	@GetMapping("/login")
	public String welcome(){
		return "Spring Boot + Azure Active Directory auth example !!! DEMO";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureAuthApplication.class, args);
	}

}
