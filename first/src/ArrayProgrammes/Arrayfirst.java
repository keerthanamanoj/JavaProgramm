package ArrayProgrammes;

import java.util.Scanner;

public class Arrayfirst {
	public static void main(String[] args) {
		// Array reading and display
		int[] a = new int[5];

		System.out.println("Enter array values: ");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter values are :");

//		for (int i = 0; i < 5; i++) {
//			System.out.println(a[i]);
//		}

		for (int v : a) {
			System.out.println(v);
		}

	}
}
