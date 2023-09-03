package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SciApplication {

	public static void main(String[] args) {
		SpringApplication.run(SciApplication.class, args);
	}

}
