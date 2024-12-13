package ControlStatements;

public class Ifelseprogram {
	public static void main(String[] args) {
		int a = 600, b = 7000, c = 90;
//  ---------greater 2 numbers ------------
//		if (a > b) {
//			System.out.println("a is greater");
//		} else {
//			System.out.println("b is greater");
//		}
		// ----------greater in 3 numbers---------------
//		if (a >= b && a >= c) {
//			System.out.println("a is greater");
//		} else if (b >= a && b >= c) {
//			System.out.println("b is greater");
//		} else {
//			System.out.println("c is greater");
//		}
		// nested if
		int age = 19;
		int weight = 50;
		if (age >= 18) {
			if (weight == 80) {
				System.out.println("eligible");
			} else {
				System.out.println("not eligible weight");
			}
		} else {
			System.out.println("not eligible age");
		}

	}
}