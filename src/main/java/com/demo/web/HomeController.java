package com.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.HomeService;

@RestController
public class HomeController {
	
	private final Logger logger=LoggerFactory.getLogger(HomeController.class);
	
	private HomeService homeService;
	
	public HomeController(HomeService homeService) {
		super();
		this.homeService = homeService;
	}
	
	@GetMapping
	public String home() {
		logger.trace("Home method");
		return homeService.geWelcomeMessage();
	}

}
