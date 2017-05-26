package com.training.oop;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.move();

		animal = new Shark();
		animal.move();

		Dog dog = new Dog();

		CanEat hungry = new Dog();
		hungry.eat("Duck");

		feed(hungry);

		CanEat someone = new HumanBeing();
		feed(someone);
	}

	public static void feed(CanEat someone) {
		someone.eat("something");
	}

	public static void main3(String[] args) {
		Animal animal = new Dog();
		moveAnimal(animal);

		animal = new Shark();
		moveAnimal(animal);
	}

	public static void moveAnimal(Animal animal) {
		System.out.println("Inside 'moveAnimal' method");
		animal.move();
	}

	public static void main2(String[] args) {
		Animal animal = new Animal("Dog");
		animal.move();
		// animal.bark();

		Animal shark = new Animal("Shark");
		shark.move();

		Animal duck = new Animal("Duck");
		duck.move();

		duck = new Animal("Dog");

		Dog dog = new Dog();
		dog.move();
		dog.bark();

		Shark shark2 = new Shark();
		shark2.move();
		// shark2.bark();

		Duck duck2 = new Duck();
		// duck2 = new Dog();

	}
}
