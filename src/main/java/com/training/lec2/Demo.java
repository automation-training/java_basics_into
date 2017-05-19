package com.training.lec2;

public class Demo {
	
	public static void main(String[] args) {
		int x = 2;
		int y = 2;
		System.out.println(x == y);
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "java";
		String s4 = "java";
		System.out.println(s3 == s4);
		
		CellPhone phone1 = new CellPhone("Black");
		CellPhone phone2 = new CellPhone("Black");
		System.out.println(phone1 == phone2);
		System.out.println(phone1.equals(phone2));
		phone1.defaultModifierExample();
		phone1.protectedModifierExample();
	}
	
	public static void main3(String[] args) {
		int a = 1;
		double d = 2.5;
		boolean b = true;
		
		int x = 2;
		int y = x;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		x++;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		CellPhone phone1 = new CellPhone("Silver");
		CellPhone phone2 = phone1;
		System.out.println("Phone1.color=" + phone1.getColor());
		System.out.println("Phone2.color=" + phone2.getColor());
		
		phone1.changeColor("White");
		System.out.println("Phone1.color=" + phone1.getColor());
		System.out.println("Phone2.color=" + phone2.getColor());
		
		String text1 = new String("java");
		System.out.println(text1);
		String text2 = text1.toUpperCase();
		System.out.println(text1);
		System.out.println(text2);
	}

	public static void main2(String[] args) {
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
