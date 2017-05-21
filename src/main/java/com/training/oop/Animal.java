package com.training.oop;

public class Animal {

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void move() {
		System.out.println(getName() + " is moving!");
	}
}
