package com.training.oop;

public class Dog extends Animal implements CanEat {

	public Dog() {
		super("Dog");
	}

	public void bark() {
		System.out.println(getName() + " is barking");
		System.out.println("Bao Wou!");
	}

	@Override
	public void move() {
		System.out.println(getName() + " is running.");
	}
	
	@Override
	public void eat(String food) {
		System.out.println(getName() + " eats " + food);
	}
}
