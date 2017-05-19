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
	
	public void publicModifierExample() {
		System.out.println("Can access!");
	}
	
	void defaultModifierExample() {
		System.out.println("Default");
	}
	
	protected void protectedModifierExample() {
		System.out.println("Protected");
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof CellPhone) {
			CellPhone other = (CellPhone) obj;
			return this.color.equals(other.color);
		}
		return false;
	}
}
