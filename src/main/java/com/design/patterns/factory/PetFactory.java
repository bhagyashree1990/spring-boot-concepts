package com.design.patterns.factory;

public class PetFactory {
	public static Pet getPet(String type,String name) {
		Pet pet = null;
		switch(type.toLowerCase()){
		case "cat":
			pet = new Cat(name);
			break;
		case "dog":
			pet = new Dog(name);
			break;
		default:
			throw new UnsupportedOperationException("Unknown type");
		}
		return pet;
	}
}
