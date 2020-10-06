package com.rui.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//组合注解 @SpringBootApplication 包含了 @EnableAutoConfiguration, @ComponentScan
//@EnableAutoConfiguration
//@ComponentScan("com.rui.demo.controller...")  
public class HelloSpringBootWebApplication {      
    
    public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootWebApplication.class, args);
	}

}