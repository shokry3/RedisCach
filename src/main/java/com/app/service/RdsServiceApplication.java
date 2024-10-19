package com.app.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="MPS Services Definition"))
@EnableCaching
public class RdsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdsServiceApplication.class, args);
	}

}
