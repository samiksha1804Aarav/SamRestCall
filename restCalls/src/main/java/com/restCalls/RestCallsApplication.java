package com.restCalls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan("com.restCalls.main")
public class RestCallsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestCallsApplication.class, args);
	}

}

