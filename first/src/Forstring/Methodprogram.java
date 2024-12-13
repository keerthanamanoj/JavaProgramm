package Forstring;

public class Methodprogram {

	public static void main(String[] args) {
		// for method;

		Methodprogram obj = new Methodprogram();
		obj.add();
		obj.sub(20, 10);
		int c = obj.multi();
		System.out.println("Multiple=" + c);
		double d = obj.divi(8, 2);
		System.out.println("divise=" + d);
	}

	// 1. Method without returntype and without parameter
	public void add() {
		int a = 10, b = 6;
		int c = a + b;
		System.out.println("Sum=" + c);
	}

	// 2. Method without returntype and with parameter
	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("Sum=" + c);
	}

	// 3. Method with returntype and without parameter
	public int multi() {
		int a = 2, b = 4;
		int c = a * b;
		return c;
	}

	// 4. Method with returntype and with parameter
	public double divi(double a, double b) {
		double d = a / b;
		return d;

	}

}
