package Forstring;

public class OddNumInRange {

	public static void main(String[] args) {
		// program to find total odd numbers 1 to 99
		int count = 0;
		for (int i = 1; i <= 99; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		System.out.print(count);

	}

}
