package com.first.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.first.entities"})
@EnableJpaRepositories(basePackages = {"com.first.repositories"})
@ComponentScan(basePackages = {"com.first.resources", "com.first.services"})
@SpringBootApplication
public class FirstChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstChallengeApplication.class, args);
	}

}
