package com.demo.service;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

	private final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@Value("${app.welcome:Welcome to Spring Boot}")
	private String appWelcomeMessage;
	
	/**
	 * The five logging levels used by Logger
	 * trace (the least serious)
	 * debug
	 * info
	 * warn
	 * error (the most serious)
	 * @return
	 */
	public String geWelcomeMessage() {
		logger.error("Welcome message error");
		logger.warn("Welcome message warn");
		logger.info("Welcome message info");
		logger.debug("Welcome message debug");
		logger.trace("Welcome message trace");
		return appWelcomeMessage;
	}
}
