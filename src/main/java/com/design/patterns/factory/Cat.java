package com.design.patterns.factory;

public class Cat implements Pet {
	private String name;
	
	public Cat(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
	
}
