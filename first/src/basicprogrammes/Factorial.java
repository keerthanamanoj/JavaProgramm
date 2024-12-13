package basicprogrammes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		do {
			System.out.println("Enter Number");
			Scanner factorial = new Scanner(System.in);
			int a = factorial.nextInt();
			int sum = 1;
			for (int i = 1; i <= a; i++) {
				sum = sum * i;
			}
			System.out.println("Factorial is" + " " + sum);
			System.out.println("Enter y");
			c = factorial.next().charAt(0);
		} while (c == 'y' || c == 'Y');

	}

}
