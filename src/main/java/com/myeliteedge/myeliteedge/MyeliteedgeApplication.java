package com.myeliteedge.myeliteedge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class MyeliteedgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyeliteedgeApplication.class, args);
	}

}


