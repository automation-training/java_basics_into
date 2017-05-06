package com.training.intro;

import java.io.File;

public class ExampleDemo {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hello again");
		
		File file;
		
		String text;
		
		int a = 2;
		System.out.println(a);
		
		double b = 2.5;
		System.out.println(b);
		
		boolean isTrue = true;
		System.out.println(isTrue);
		
		isTrue = false;
		System.out.println(isTrue);
		
		text = "Hello Automated World!";
		System.out.println(text);
		
		System.out.println(text.length());
		
		System.out.println(text.toUpperCase());
		
		System.out.println(text.toLowerCase());
		
		int[] array;
		array = new int[3];
		
		System.out.println(array[0]);
		array[0] = 3;
		array[1] = 4;
		array[2] = 5;
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		System.out.println(array[3]);
	}
}
