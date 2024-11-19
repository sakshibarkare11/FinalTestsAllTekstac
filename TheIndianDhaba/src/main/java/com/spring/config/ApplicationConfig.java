package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Use appropriate annotation

@Configuration
@ComponentScan("com.*")
@PropertySource("restuarantDetails.properties")
public class ApplicationConfig {

}
