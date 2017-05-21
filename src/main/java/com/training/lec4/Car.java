package com.training.lec4;

public class Car {
	
	private static int recordSpeed;

	private String made;
	
	private int currentSpeed;
	
	public Car(String carMade) {
		made = carMade;
	}
	
	public String getMade() {
		return made;
	}
	
	public void setSpeed(int speed) {
		currentSpeed = 100;
	}
	
	public int getSpeed() {
		return currentSpeed;
	}
	
	public void speedUp(int increase) {
		currentSpeed = currentSpeed + increase;
	}
	
	public static void setRecordSpeed(int record) {
		recordSpeed = record;
	}
	
	public static int getRecordSpeed() {
		return recordSpeed;
	}
	
}
