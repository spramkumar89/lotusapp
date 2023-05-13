package com.ram.dev.lotusapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LotusappApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(LotusappApplication.class, args);
		
		System.out.println("Lotusapp Started");
	}

}
