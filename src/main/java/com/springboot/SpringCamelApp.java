package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class SpringCamelApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println( "Hello World!" );
				SpringApplication.run(SpringCamelApp.class, args);
				while (true){}
	}

}
