package oops;

class Father {
	public void education() {
		System.out.println("MCA");
	}

	public void job() {
		System.out.println("Engineer");
	}
}

class sin extends Father {
	public void education() {
		System.out.println("BTech");
		super.education();
	}

	public void job() {
		System.out.println("Designer");
	}
}

public class MethodOverriding {

}
