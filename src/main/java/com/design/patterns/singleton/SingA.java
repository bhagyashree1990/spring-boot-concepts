package com.design.patterns.singleton;

public class SingA {
	private SingA() {
		super();
	}
	public static SingA instance;
	
	public static SingA getInstance() {
		if(instance == null) {
			synchronized (SingA.class) {
				if(instance  == null)
					instance = new SingA();
			}
		}
		return instance;
	}
}
