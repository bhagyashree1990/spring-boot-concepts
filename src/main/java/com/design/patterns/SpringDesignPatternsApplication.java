package com.design.patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.design.patterns.singleton.SingA;

@SpringBootApplication
public class SpringDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDesignPatternsApplication.class, args);
	}

	@Bean
	public SingA getSingA() {
		return SingA.getInstance();
	}
}
