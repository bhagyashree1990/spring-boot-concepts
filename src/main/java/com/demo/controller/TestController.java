package com.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.configuration.AppProperties;

@RestController
public class TestController {
	
	@Autowired 
	private AppProperties appProperties;
	
	@GetMapping("/")
	public Map<String, String> propertiesMap(){
		return appProperties.getPerson();
	}
	
}
