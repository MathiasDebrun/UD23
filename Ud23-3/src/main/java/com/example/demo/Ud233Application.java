package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ud233Application {

	public static void main(String[] args) {
		SpringApplication.run(Ud233Application.class, args);
		System.out.println("Hola mundo");
	}
	
	@GetMapping
	public String hola(){
		return "Hola mundo!";
	}

}
