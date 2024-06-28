package com.genius.spring_2024;

import com.genius.spring_2024.config.jackson.LongEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring2024Application {

	public static void main(String[] args) {
		System.out.println(LongEncoder.encode48(1));
		SpringApplication.run(Spring2024Application.class, args);
	}

}
