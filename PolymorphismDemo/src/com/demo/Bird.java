package com.demo;

public class Bird implements AnimalInterface{
	// override phương thức trừu tượng
	@Override
	public void introduce() {
		System.out.println("I'm Bird");
	}
}