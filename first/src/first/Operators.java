package first;

public class Operators {
public static void main (String[] args) {
	// --------------Arithmetic Operators---------------
	int a=30, b=20;
	System.out.println("a+b = " + (a+b));
	System.out.println("a-b = " + (a-b));
	System.out.println("a*b = " + (a*b));
	System.out.println("a%b = " + (a%b));
	System.out.println("a/b = " + (a/b));
	
	// Assignemnt Operators
	
//	System.out.println("a+=b");
//	System.out.println("a-=b");
	
	// Relational Operators
	
//	int c = 10, d=10;
//	System.out.println(c==d);
//	System.out.println(c<d);
//	System.out.println(c<=d);
	
	// logical Operator
	String ab = "abc";
	String pwd = "hello";
	
	System.out.println(ab == "abc" && pwd == "hello");
	System.out.println(ab == "bc" || pwd == "ello");	
	System.out.println(!(ab == "abc"));
	
	//-----------unary operator-------------------
	int i = 5;
	System.out.println(i++);
	System.out.println(i);
	System.out.println(++i);
	
	// Ternary Operator
	int l = 100, j= 20;
	String v3 = l > j ? "l is greater": "j is greater";
	System.out.println("v3" + v3);
	

	
	
	
	
}}
