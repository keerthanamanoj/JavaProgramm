package Forstring;

import java.util.Scanner;

public class EvenOddNumArray {

	public static void main(String[] args) {
		// Even and odd numbers count in array of integers;

		int[] arr = new int[5];
		System.out.println("Enter values");

		Scanner sc = new Scanner(System.in);
		int sumOdd = 0;
		int sumEven = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
//			sum += arr[i]; for sum
			if (arr[i] % 2 == 0) {
				sumEven++;
			} else {
				sumOdd++;
			}
		}
		;

		System.out.println("sum of even =" + sumEven + "sum of odd =" + sumOdd);

	}

}
