package oops;

class Vehicle {
	public void car() {
		System.out.println("Carssss");
	}
}

class Brands extends Vehicle {
	public void Kia() {
		System.out.println("Kia");
	}
}

class Property extends Vehicle {
	public void Prop() {
		System.out.println("black Kia Car YaaaYiiii!!");
	}
}

public class HeirarchialInheritance {

	public static void main(String[] args) {
		// TODO
		Brands obj = new Brands();
		obj.Kia();
		obj.car();
		Property obj1 = new Property();
		obj1.Prop();
		obj1.car();
	}

}
