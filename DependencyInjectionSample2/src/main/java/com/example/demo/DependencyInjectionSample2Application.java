package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.chapter03.used.Greet;

@SpringBootApplication
public class DependencyInjectionSample2Application {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionSample2Application.class, args).getBean(DependencyInjectionSample2Application.class).execute();
	}
	
	@Autowired
	Greet greet;
	
	private void execute() {
		greet.greeting();
	}
	
}
