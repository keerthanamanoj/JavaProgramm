package Forstring;

public class AreaFinder {

	public static void main(String[] args) {
		// 1.Triangle = 0.5 * b * h
		AreaFinder obj = new AreaFinder();
		obj.triangle();

		// 2. Circle = 3.14 * r *r
		obj.Circle(3);

		// 3.Rectangle = l * b
		int rec = obj.Rectangle();
		System.out.println("Rectangle =" + rec);

		// 4. Square = a*a;
		int d = obj.square(8);
		System.out.println("Square =" + d);

	}

	//
	public void triangle() {
		int a = 5, b = 6;
		float c = 0.5f;
		int area = (int) (c * a * b);
		System.out.println("Triangle =" + area);
	}

	//
	public void Circle(int a) {
		double d = 3.14 * a * a;
		System.out.println("Circle =" + d);
	}

	// 3. Method with returntype and without parameter
	public int Rectangle() {
		int l = 5, b = 10;
		int c = l * b;
		return c;
	}

	// 4
	// 4. Method with returntype and with parameter
	public int square(int a) {
		int d = a * a;
		return d;

	}

}
