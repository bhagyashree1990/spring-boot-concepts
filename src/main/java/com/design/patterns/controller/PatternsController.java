package com.design.patterns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.design.patterns.factory.Pet;
import com.design.patterns.factory.PetFactory;

@RestController
public class PatternsController {

	
	@GetMapping("/adoptPet/{type}/{name}")
	public Pet adoptPet(@PathVariable String type,@PathVariable String name) {
		return PetFactory.getPet(type, name); 
	}
	
}
