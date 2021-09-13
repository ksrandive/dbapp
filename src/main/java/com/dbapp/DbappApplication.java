package com.dbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DbappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbappApplication.class, args);
	}

}
