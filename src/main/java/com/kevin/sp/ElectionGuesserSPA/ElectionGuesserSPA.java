package com.kevin.sp.ElectionGuesserSPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ElectionGuesserSPA extends SpringBootServletInitializer {

	// main driver of SPA
	public static void main(String[] args) {
		SpringApplication.run(ElectionGuesserSPA.class, args);
	}

}
