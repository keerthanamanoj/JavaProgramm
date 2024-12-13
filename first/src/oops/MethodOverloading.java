package oops;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.add(1, 2);
		obj.add(10, 4, 6);
		obj.add(8, 6.1);
		obj.add(8.2, 4);
	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
	}

	public void add(int a, double b) {
		double c = a + b;
		System.out.println(c);
	}

	public void add(double a, int b) {
		double c = a + b;
		System.out.println(c);
	}

}
