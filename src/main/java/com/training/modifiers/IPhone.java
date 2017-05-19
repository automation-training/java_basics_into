package com.training.modifiers;

import com.training.lec2.CellPhone;

public class IPhone extends CellPhone {

	public IPhone(String color) {
		super(color);
		this.protectedModifierExample();
	}
}
