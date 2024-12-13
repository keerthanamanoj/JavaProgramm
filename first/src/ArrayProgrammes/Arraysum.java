package ArrayProgrammes;

import java.util.Scanner;

public class Arraysum {
	public static void main(String[] args) {
		int[] arr = new int[4];
		System.out.println("Enter values");

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		;

		System.out.println("sum =" + sum);

	}
}
