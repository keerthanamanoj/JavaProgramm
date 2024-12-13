package ArrayProgrammes;

import java.util.Scanner;

public class ArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][3];
		System.out.print("Enter the array values: ");

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter array values are: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
