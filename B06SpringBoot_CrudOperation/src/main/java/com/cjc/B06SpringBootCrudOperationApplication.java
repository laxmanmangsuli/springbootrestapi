package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class B06SpringBootCrudOperationApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot CRUD");
		SpringApplication.run(B06SpringBootCrudOperationApplication.class, args);
	}

}
