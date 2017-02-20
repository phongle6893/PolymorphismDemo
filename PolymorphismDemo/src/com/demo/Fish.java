package com.demo;

public class Fish extends Animal {
	
	//Ghi đè phương thức khi extends class
	@Override
	public void introduce() {
		System.out.println("I'm Fish 123");
	}
}
