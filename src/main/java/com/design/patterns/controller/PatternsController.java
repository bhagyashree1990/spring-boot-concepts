package com.design.patterns.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.design.patterns.builder.Contact;
import com.design.patterns.builder.ContactBuilder;
import com.design.patterns.factory.Pet;
import com.design.patterns.factory.PetFactory;

@RestController
public class PatternsController {

	
	@GetMapping("/adoptPet/{type}/{name}")
	public Pet adoptPet(@PathVariable String type,@PathVariable String name) {
		return PetFactory.getPet(type, name); 
	}

	@GetMapping("/presidents")
	public List<Contact> getPresidents(){
		List<Contact> contacts = new ArrayList<Contact>();
		Contact contact = new Contact();
		contact.setFirstName("Narendra");
		contact.setLastName("Modi");
		contacts.add(contact);
		
		Contact contact2 = new Contact("Manmohan","Singh", null);
		contacts.add(contact2);
		
		contacts.add(new ContactBuilder().setFirstName("Atal").setLastName("Vajpayee").build());
		
		return contacts;
	}
}
