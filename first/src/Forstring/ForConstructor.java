package Forstring;

public class ForConstructor {
	// constructor program
	String empName;
	String empQualification;

	public ForConstructor(String empName, String empQualification) {
		this.empName = empName;
		this.empQualification = empQualification;
	}

	public void display() {
		System.out.println(empName);
		System.out.println(empQualification);
	}

	public static void main(String[] args) {
		ForConstructor ob = new ForConstructor("abc", "mca");
		ob.display();
	}

}
