package com.halehabank.halehabank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.halehabank.controller")
public class HalehaBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(HalehaBankApplication.class, args);
	}

}
