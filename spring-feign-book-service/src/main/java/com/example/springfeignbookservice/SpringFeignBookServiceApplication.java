package com.example.springfeignbookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringFeignBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignBookServiceApplication.class, args);
	}

}
