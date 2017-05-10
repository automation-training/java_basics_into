package com.training.lec2;

public class Demo {

	public static void main(String[] args) {
		CellPhone cellPhone;
		cellPhone = new CellPhone("Black");
		System.out.println(cellPhone.getColor());
		
		CellPhone cellPhone2 = new CellPhone("White");
		System.out.println(cellPhone2.getColor());
		
		// old object
		System.out.println(cellPhone.getColor());
//		System.out.println(cellPhone.color);
		
		cellPhone.changeColor("Silver");
		System.out.println(cellPhone.getColor());
	}
}
