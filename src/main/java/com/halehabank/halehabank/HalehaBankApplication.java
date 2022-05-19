package com.halehabank.halehabank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({
		@ComponentScan("com.halehabank.controller"),
		@ComponentScan("com.halehabank.config")
})
public class HalehaBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(HalehaBankApplication.class, args);
	}

}
