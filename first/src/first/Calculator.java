package first;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char c;
		do {
			System.out.println("Enter 2 Number");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Enter your choice +, -, *, /");

			char ch = sc.next().charAt(0);

			switch (ch) {
			case '+':
				System.out.println("Add result =" + (a + b));
				break;
			case '-':
				System.out.println("Sub result =" + (a + b));
				break;

			case '*':
				System.out.println("Multiplication result =" + (a * b));
				break;
			case '/':
				System.out.println("Division result =" + (a / b));
				break;

			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue y/n");
			c = sc.next().charAt(0);
		} while (c == 'y' || c == 'Y');

	}

}
