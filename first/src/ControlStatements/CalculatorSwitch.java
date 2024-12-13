package ControlStatements;

public class CalculatorSwitch {

	public static void main(String[] args) {
		int i = 10, j = 20;
		char operator = '%';
		switch (operator) {
		case '+':
			System.out.println("addition =" + (i + j));
			break;
		case '-':
			System.out.println("substraction =" + (i - j));
			break;
		case '*':
			System.out.println("multiplication =" + (i * j));
			break;
		case '%':
			System.out.println("modulus =" + (i % j));
			break;
		case '/':
			System.out.println("division =" + (i / j));
			break;

		default:
			System.out.println("Default");
		}
	}
}
