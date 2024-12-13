package Forstring;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String");
		String ab = sc.next();
		VowelCount obj = new VowelCount();
		int total = obj.vowel(ab);

	}

// with return type and parameter	
	public int vowel(String ab) {
		int totLength = ab.length();
		int count = 0;

		for (int i = totLength - 1; i >= 0; i--) {
			if (ab.charAt(i) == 'a' || ab.charAt(i) == 'e' || ab.charAt(i) == 'i' || ab.charAt(i) == 'o'
					|| ab.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);
		return 0;

	}

}
