package com.training.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.lec4.Car;

public class CarTest {

	@Test
	public void testCarMade() {
		Car car = new Car("Ferrari");

		boolean result = car.getMade().equals("Ferrari");

		// Assert.assertTrue(result, "Incorrect Car made initialilzation");
		Assert.assertEquals(car.getMade(), "Ferrari", "Incorrect Car made initialilzation");
	}

	@Test
	public void testSetSpeedMethod() {
		Car car = new Car("Mercedes");
		car.setSpeed(150);

		Assert.assertEquals(car.getSpeed(), 150, "Incorrect car speed after 'setSpeed' method invocation.");
	}

	@Test(dependsOnMethods = "testSetSpeedMethod")
	public void testSpeedUpMethod() {
		Car car = new Car("Subaru");
		car.setSpeed(80);
		car.speedUp(20);

		Assert.assertEquals(car.getSpeed(), 100, "Incorrect car speed after 'speedUp' method invocation");
	}
}
