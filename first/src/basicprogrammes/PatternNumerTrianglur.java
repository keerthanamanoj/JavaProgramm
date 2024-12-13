package basicprogrammes;

public class PatternNumerTrianglur {
	public static void main(String[] args) {
		int n = 3;
		for (int i = 1; i <= n; i++) {

			for (int s = 1; s <= 3 - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print(i);
			}

			System.out.println();
		}
	}
}
