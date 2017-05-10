package com.training.lec2;

public class CellPhone {

	// Field
	private String color;
	
	// Constructor
	public CellPhone(String initialColor) {
		color = initialColor;
		System.out.println("Within constructor");
	}
	
	// method
	public String getColor() {
		return color;
	}
	
	public void changeColor(String newColor) {
		color = newColor;
	}
}
