package com.springlearn.learnspringdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@ComponentScan(basePackages = {"src.main.java.com.springlearn.learnspringdb"})
@SpringBootApplication
public class UsermanagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(UsermanagementApplication.class, args);
	}



}
