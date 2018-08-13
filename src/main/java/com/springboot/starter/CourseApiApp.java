package com.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
	/*Step 1. Tell Spring that this is a spring application and to start a servlet Container 
	and host this app in that servlet containner and make it available.*/
		
		SpringApplication.run(CourseApiApp.class, args);
		
		

	}

}
