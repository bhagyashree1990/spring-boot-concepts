package com.design.patterns.factory;

public class Dog implements Pet {
	private String name;
	
	public Dog(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
