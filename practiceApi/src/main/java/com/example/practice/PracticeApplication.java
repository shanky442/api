package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@ComponentScan("com.example")
@SpringBootApplication
public class PracticeApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

}
