package com.rui.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//组合注解 @SpringBootApplication 包含了 @EnableAutoConfiguration, @ComponentScan
//@EnableAutoConfiguration
//@ComponentScan("com.rui.demo.controller...")  
@EnableScheduling
public class HelloSpringBootWebApplication {      
    
    public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootWebApplication.class, args);
	} 
}