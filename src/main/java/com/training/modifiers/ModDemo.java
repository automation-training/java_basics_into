package com.training.modifiers;

import com.training.lec2.CellPhone;

public class ModDemo {

	public static void main(String[] args) {
		CellPhone phone = new CellPhone("Green");
		phone.publicModifierExample();
		//phone.defaultModifierExample();
		//phone.protectedModifierExample();
	}
}
