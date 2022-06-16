package com.Inheritance;

public class Smartphone extends BasicMobile{
String camera="DualCamera";
String display="Touch";
	public static void main(String[] args) {
		Smartphone mobile=new Smartphone();
		mobile.show();
		System.out.println(mobile.call);
		System.out.println(mobile.batterycapacity);
		System.out.println(mobile.bluetooth);
		System.out.println();
		System.out.println("Smartphone: Added features :");
		System.out.println(mobile.camera);
		System.out.println(mobile.display);
		

	}

}
