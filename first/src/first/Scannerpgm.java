 package first;

import java.util.Scanner;

public class Scannerpgm {
public static void main(String[] args) {
	System.out.println("Enter Number");
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	System.out.println("Entered value=" + a);
	System.out.println("Entered a character");
	
	char c = sc.next().charAt(0);
	System.out.println("Entered character is" + c);
}
}
