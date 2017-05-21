package com.training.lec4;

public class CarDemo {

	public static void main(String[] args) {
		Car car1 = new Car("Mercedes");
		Car car2 = new Car("BMW");

		System.out.println(car1.getSpeed());
		System.out.println(car2.getSpeed());
		
		car1.setSpeed(60);
		car2.setSpeed(75);
		
		System.out.println(car1.getSpeed());
		System.out.println(car2.getSpeed());
		
		System.out.println(car1.getRecordSpeed());
		System.out.println(car2.getRecordSpeed());
		
		car1.setRecordSpeed(240);
		
		System.out.println(car1.getRecordSpeed());
		System.out.println(car2.getRecordSpeed());
		
		System.out.println(Car.getRecordSpeed());
		
		Car.setRecordSpeed(300);
		System.out.println(Car.getRecordSpeed());
		System.out.println(car1.getRecordSpeed());
		
		car2.speedUp(25);
		System.out.println(car2.getSpeed());
		
	}

}
