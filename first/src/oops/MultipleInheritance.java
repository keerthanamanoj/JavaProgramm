package oops;

class Classroom {
	public void Teacher() {
		System.out.println("Rukma miss");
	}
}

class Student extends Classroom {
	public void StudentName() {
		System.out.println("Keerthana");
	}
}

class Course extends Student {
	public void CourseDetails() {
		System.out.println("Software Testing");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO
		Course obj = new Course();
		obj.Teacher();
		obj.StudentName();
		obj.CourseDetails();

	}

}
