package basicprogrammes;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		System.out.print("Enter string");
		Scanner pal = new Scanner(System.in);

		int a = pal.nextInt();
		int temp = a;
		int rev = 0;

		while (a > 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;
		}
		if (temp == rev) {
			System.out.print("Palindrome");
		} else {
			System.out.print("Not palindrome");
		}
	}
}
