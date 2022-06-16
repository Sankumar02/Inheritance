package com.Inheritance;

class Calulator {
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}
}

class Advancecalculator extends Calulator {
	public float mod(float num1, float num2) {
		return num1 % num2;
	}

	public float square(float num) {
		return num * num;
	}
}

class Area extends Advancecalculator {
	public float sqrt(float num) {
		return (float) (Math.sqrt(num));
	}

	public float recatange(float lenght, float breadth) {
		return lenght * breadth;
	}

	public float circle(float r) {
		return (float) (3.142 * r * r);
	}
}

public class MultilevelInheritanceExample {

	public static void main(String[] args) {
		Area calculation = new Area();
		System.out.println("Addition :" + calculation.add(2, 3));
		System.out.println("Subraction :" + calculation.sub(3, 2));
		System.out.println("Modulus :" + calculation.add(5, 5));
		System.out.println("Square :" + calculation.square(2));
		System.out.println("SquareRoot :" + calculation.sqrt(4));
		System.out.println("Rectangle :" + calculation.recatange(2, 3));
		System.out.println("Circle :" + calculation.circle(1));
	}

}
