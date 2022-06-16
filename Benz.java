package com.Task_18_04_22;

public class Benz extends Maruti {

	public Benz() {
		System.out.println("Class Benz");
	}

	public void speed() {
		super.speed();
		System.out.println("Maximum speed of the vehicle is 100 KMPH");
	}

	public static void main(String[] args) {
		Benz oBenz = new Benz();
		oBenz.vechicleType();
		oBenz.brand();
		oBenz.speed();

	}
}