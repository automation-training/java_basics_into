package com.training.oop;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal animal = new Animal("Dog");
		animal.move();
		
		Animal shark = new Animal("Shark");
		shark.move();
		
		Animal duck = new Animal("Duck");
		duck.move();
		
		duck = new Animal("Dog");
		
		Dog dog = new Dog();
		dog.move();
		
		Shark shark2 = new Shark();
		
		Duck duck2 = new Duck();
//		duck2 = new Dog();
	}
}
