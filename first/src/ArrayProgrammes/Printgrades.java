package ArrayProgrammes;

import java.util.Scanner;

public class Printgrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your grade a,b,c");
		char a = sc.next().charAt(0);

		switch (a) {
		case 'a':
			System.out.println("Excellent");
			break;
		case 'b':
			System.out.println("Good");
			break;
		case 'c':
			System.out.println("Avg");
			break;
		case 'd':
			System.out.println("Need imporvemnt");
			break;

		default:
			System.out.println("Invalid");
		}
	}

}
