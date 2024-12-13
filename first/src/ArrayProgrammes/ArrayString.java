package ArrayProgrammes;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		// String array declaration and display
		String[] a = new String[5];

		System.out.println("Enter array Items: ");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextLine();
		}

		System.out.println("Entered array values are :");

		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}

	}

}
