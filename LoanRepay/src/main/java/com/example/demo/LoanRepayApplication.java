package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.entities")
@ComponentScan(basePackages={"com.repository","com.controller","com.entities","com.service","com.exception"})
@EnableJpaRepositories("com.repository")
@SpringBootApplication
public class LoanRepayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanRepayApplication.class, args);
	}

}
