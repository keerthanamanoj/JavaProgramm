package oops;

public class AccessModifier {
	public static void main(String[] args) {
		AccessModifiersExample example = new AccessModifiersExample();

		// Access public method
		example.publicMethod();

		// Access protected method
		example.protectedMethod();

		// Access default method
		example.defaultMethod();

		// Cannot access private method directly, uncommenting below will give an error
		// example.privateMethod();
	}
}

// Class demonstrating access modifiers
class AccessModifiersExample {

	// Private method: Accessible only within this class
	private void privateMethod() {
		System.out.println("Private method accessed!");
	}

	// Default method: Accessible within the same package
	void defaultMethod() {
		System.out.println("Default method accessed!");
	}

	// Protected method: Accessible within the same package and subclasses
	protected void protectedMethod() {
		System.out.println("Protected method accessed!");
	}

	// Public method: Accessible from anywhere
	public void publicMethod() {
		System.out.println("Public method accessed!");

		// Accessing the private method within the class
		privateMethod();
	}
}
