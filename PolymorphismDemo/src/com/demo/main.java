package com.demo;

//	Tính đa hình ( polymorphism )
//	1) Đa hình tĩnh ( compile-time / static polymorphism )
//		- Overload
//		- Override
//	2) Đa hình động ( Run-time / Interface polymorphism )

public class main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.introduce();
		animal.introduce("Khanh");
		
		Animal fish = new Fish();
		fish.introduce();
		
		Bird bird = new Bird();
		bird.introduce();
	}
}
