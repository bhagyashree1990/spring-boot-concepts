package com.demo.configuration;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {
	private Map<String, String> person;

	public Map<String, String> getPerson() {
		return person;
	}

	public void setPerson(Map<String, String> person) {
		this.person = person;
	}
	
	
}
