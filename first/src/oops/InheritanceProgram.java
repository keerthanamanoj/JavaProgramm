package oops;
// Singlelevel Inheritance

class Parent {
	int a;

	public void Parentmethod() {
		System.out.println("parent");
	}
}

class Child extends Parent {
	public void Childmethod() {
		System.out.println("child");
	}
}

public class InheritanceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ob = new Child();
		ob.a = 34;
		ob.Childmethod();
		ob.Parentmethod();
		System.out.println(ob.a);
	}

}
