package ArrayProgrammes;

import java.util.Scanner;

public class Extraproblms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1 2 3 4
//		1 2 3
//		1 2
//		1
//		for (int i = 4; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println(" ");
//		}

//		4 4 4 4
//		3 3 3 
//		2 2
//		1
//		for (int i = 4; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println(" ");
//		}

//      program to count even and odd num from 1 to n
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int oddnum = 0;
		int evennum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				evennum++;
			} else {
				oddnum++;
			}
		}

		System.out.println("count of even numbr is" + evennum);
		System.out.println("count of odd numbr is" + oddnum);

	}

}
