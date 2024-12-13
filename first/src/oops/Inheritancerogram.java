package oops;

class Member {
	String name;
	int age;
	String address;

	public void MemberDetails() {
		System.out.print(name + "keerthana");
		System.out.print(age + "27");
		System.out.print(address + "Salkan");
	}

}

class Employee extends Member {
	String spec1;
}

class Manager extends Member {
	String Spec2;
}

public class Inheritancerogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob1 = new Employee();
		Manager ob2 = new Manager();
	}
}
