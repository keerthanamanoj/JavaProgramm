package basicprogrammes;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Enter a Number");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int total = 0;
//		int temp = a;
//
//		while (a > 0) {
//			int rim = a % 10;
//			total = total + rim * rim * rim;
//			a = a / 10;
//		}
//
//		if (temp == total) {
//			System.out.println("Amstrong num");
//		} else {
//			System.out.println("Not a amstrong");
//		}

		// ----------- first 10 numbers-----------------
//		int i = 1, sum = 0;
//		for (i = 1; i <= 10; i++) {
//			System.out.println(sum += i);
//		}

		// ------------------even numbers from 1 to 20--------------
//		int i = 1;
//		for (i = 1; i <= 20; i++) {
//
//			if (i % 2 == 0) {
//				// even
//				System.out.println(i);
//			} else {
//				// odd
//			}
//		}

//		------------------factorail of anumber----------------
//		int n = 4, total = 1;
//
//		for (int i = 1; i <= n; i++) {
//			total = total * i;
//		}
//		System.out.println(total);

//		--------pattern---------
//		int k = 1;
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(k + " ");

//				k++;
//			}
//			System.out.println();
//		}

		// --------------reverse a number -----------
		int num = 564;
		int rev = 0;
		int temp = num;
		while (num > 0) {
			int n = num % 10;
			rev = rev * 10 + n;
			n = n / 10;
		}
		System.out.println(rev);
		// if temp == rev // pallindrome
		if (temp == rev) {

		}
	}
}
