package com.example.testrepo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication

public class Testrepo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Testrepo1Application.class, args);
	}



}
